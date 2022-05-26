/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author JonathanCoronel
 */
public class Propietario {
    private String nombre;
    private String apellido;
    private String identificacion;
    
    public void establecerNombre(String n){
        nombre =n;
    }
    public void establecerApellido(String n){
        nombre =n;
    }
    public void establecerIdentificacion(String n){
        nombre =n;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerApellido(){
        return apellido;
    }
    public String obtenerIdentificacion(){
        return identificacion;
    }
}
