/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ArchivoLecturaCiudad {

    private ObjectInputStream entrada;
    private ArrayList<Ciudad> ciudad;
    private String nombreArchivo;
    String nombreCiudad;
    Ciudad CiudadBuscado;

    public ArchivoLecturaCiudad(String n) {
        nombreArchivo = n;
        File f = new File(nombreArchivo);
        if (f.exists()) {
            try {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } catch (IOException ioException) {
                System.err.println("Error al abrir el archivo." + ioException);
            }
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerNombreCiudad(String n) {
        nombreCiudad = n;
    }

    public void establecerCiudades() {

        ciudad = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Ciudad registro = (Ciudad) entrada.readObject();
                    ciudad.add(registro);
                } catch (EOFException endOfFileException) {
                    return; // se llegó al fin del archivo

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    // System.err.println("No hay datos en el archivo: " + ex);
                    break;
                }
            }
        }
    }

    public void establecerCiudadBuscada(String n) {
        // 
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Ciudad registro = (Ciudad) entrada.readObject();

                    if (registro.obtenerNombreCiudad().equals(n)) {
                        CiudadBuscado = registro;
                        break;//Salir obligatoriamente del ciclo
                    }

                } catch (EOFException endOfFileException) {
                    return; // se llegó al fin del archivo
                    // se puede usar el break;
                    // System.err.println("Fin de archivo: " + endOfFileException);

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }

    public ArrayList<Ciudad> obtenerCiudades() {
        return ciudad;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public Ciudad obtenerCiudadBuscada() {
        return CiudadBuscado;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Hospitales\n";
        for (int i = 0; i < obtenerCiudades().size(); i++) {
            Ciudad p = obtenerCiudades().get(i);
            cadena = String.format("%s(%d) %s - %s\n", cadena,
                    i + 1,
                    p.obtenerNombreCiudad(),
                    p.obtenerNombreProvincia());
        }

        return cadena;
    }

    public void cerrarArchivo() {
        try {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        }
    }

}
