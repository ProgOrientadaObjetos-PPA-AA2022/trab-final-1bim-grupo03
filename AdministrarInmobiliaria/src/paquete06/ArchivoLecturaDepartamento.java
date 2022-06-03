/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

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
public class ArchivoLecturaDepartamento {

    private ObjectInputStream entrada;
    private ArrayList<Departamento> departamento;
    private String nombreArchivo;
    String idCasa;
    Departamento DepartamentoBuscado;

    public ArchivoLecturaDepartamento(String n) {
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

    public void establecerID(String n) {
        idCasa = n;
    }

    public void establecerDepartamentos() {

        departamento = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Departamento registro = (Departamento) entrada.readObject();
                    departamento.add(registro);
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

    /*public void establecerCasaBuscada() {
        // 
         File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Casa registro = (Casa) entrada.readObject();
                    
                    if(registro.obtenerID().equals(idCasa)){
                        CasaBuscado = registro;
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
    }*/
    public ArrayList<Departamento> obtenerDepartamentos() {
        return departamento;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerID() {
        return idCasa;
    }

    /* public Casa obtenerHospitalID() {
        return CasaBuscado;
    }*/
    @Override
    public String toString() {
        String cadena = "Lista de Departamentos\n";
        for (int i = 0; i < obtenerDepartamentos().size(); i++) {
            Departamento p = obtenerDepartamentos().get(i);
            cadena = String.format("%s\n"
                    + "Nombre Propietario: %s \n"
                    + "Apellido Propietario: %s \n"
                    + "Identificacion Propietario: %s \n"
                    + "Precio por metro Cuadrado: %.2f \n"
                    + "Numero de metros Cuadrados: %.2f \n"
                    + "Costo Final: %.2f \n"
                    + "Nombre del Barrio: %s \n"
                    + "Referencia del Barrio %s \n"
                    + "Nombre de la Ciudad: %s \n"
                    + "Nombre de la Provincia: %s \n"
                    + "Alicuota Mensual: %.2f \n"
                    + "Nombre Constructora: %s \n"
                    + "ID de la Constructora: %s\n",
                    cadena,
                    p.obtenerPropietario().obtenerNombre(),
                    p.obtenerPropietario().obtenerApellido(),
                    p.obtenerPropietario().obtenerIdentificacion(),
                    p.obtenerPrecioMetroCuadrado(),
                    p.obtenerNumMetros(),
                    p.obtenerCostoFinal(),
                    p.obtenerBarrio().obtenerNombreBarrio(),
                    p.obtenerBarrio().obtenerReferencia(),
                    p.obtenerCiudad().obtenerNombreCiudad(),
                    p.obtenerCiudad().obtenerNombreProvincia(),
                    p.obtenerValorAlicuota(),
                    p.obtenerConstructora().obtenerNombreConstructora(),
                    p.obtenerConstructora().obtenerIdConstructora()
            );

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
