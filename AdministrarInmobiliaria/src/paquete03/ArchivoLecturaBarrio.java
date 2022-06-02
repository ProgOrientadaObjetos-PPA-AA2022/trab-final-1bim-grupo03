/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

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
public class ArchivoLecturaBarrio {

    private ObjectInputStream entrada;
    private ArrayList<Barrio> barrio;
    private String nombreArchivo;
    String nombreBarrio;
    Barrio barrioBuscado;

    public ArchivoLecturaBarrio(String n) {
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

    public void establecerNombreBarrio(String n) {
        nombreBarrio = n;
    }

    public void establecerCasas() {

        barrio = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Barrio registro = (Barrio) entrada.readObject();
                    barrio.add(registro);
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

    public void establecerCasaBuscada() {
        // 
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Barrio registro = (Barrio) entrada.readObject();

                    if (registro.obtenerNombreBarrio().equals(nombreBarrio)) {
                        barrioBuscado = registro;
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

    public ArrayList<Barrio> obtenerBarrios() {
        return barrio;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerNombreCiudad() {
        return nombreBarrio;
    }

    public Barrio obtenerCiudadBuscada() {
        return barrioBuscado;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Barrios\n";
        for (int i = 0; i < obtenerBarrios().size(); i++) {
            Barrio p = obtenerBarrios().get(i);
            cadena = String.format("%s(%d) %s - %s\n", cadena,
                    i + 1,
                    p.obtenerNombreBarrio(),
                    p.obtenerReferencia());
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
