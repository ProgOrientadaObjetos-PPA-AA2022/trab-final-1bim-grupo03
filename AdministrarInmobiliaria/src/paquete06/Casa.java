/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author JonathanCoronel
 */
public class Casa {
    private Propietario prop;
    private double precioMetroCuadrado;
    private double numMetros;
    private double costoFinal;
    private Barrio bar;
    private Ciudad ciu;
    private int numCuartos;
    private Constructora construc;
    
    public void establecerProp(Propietario n){
        prop=n;
    }
}
