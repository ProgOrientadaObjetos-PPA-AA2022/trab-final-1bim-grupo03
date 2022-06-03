/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.io.Serializable;

/**
 *
 * @author JonathanCoronel y Pablo Figueroa
 */
public class Barrio implements Serializable{

    private String nombreBarrio;
    private String referencia;

    public Barrio(String nomBar, String refe) {
        nombreBarrio = nomBar;
        referencia = refe;
    }

    public void establecerNombreBarrio(String n) {
        nombreBarrio = n;
    }

    public void establecerReferencia(String n) {
        referencia = n;
    }

    public String obtenerNombreBarrio() {
        return nombreBarrio;
    }

    public String obtenerReferencia() {
        return referencia;
    }
}
