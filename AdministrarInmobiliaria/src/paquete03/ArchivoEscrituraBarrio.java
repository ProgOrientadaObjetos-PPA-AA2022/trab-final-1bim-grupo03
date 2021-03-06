/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ArchivoEscrituraBarrio {

    private String nombreArchivo;
    private ObjectOutputStream salida; // envía los datos a un archivo
    private Barrio registro;
    private ArrayList<Barrio> lista;

    public ArchivoEscrituraBarrio(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerLista();
        try {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            if (obtenerLista().size() > 0) {
                for (int i = 0; i < obtenerLista().size(); i++) {
                    establecerBarrio(obtenerLista().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerBarrio(Barrio p) {
        registro = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registro);
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    public void establecerLista() {
        ArchivoLecturaBarrio l = new ArchivoLecturaBarrio(obtenerNombreArchivo());
        l.establecerBarrios();
        lista = l.obtenerBarrios();
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<Barrio> obtenerLista() {
        return lista;
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void cerrarArchivo() {
        try {
            if (salida != null) {
                salida.close();
            }
        } catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
        }
    }
}
