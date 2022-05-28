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
 * @author JonathanCoronel y Pablo Figueroa
 */
public class Casa {

    private Propietario propietario;
    private double precioMetroCuadrado;
    private double numMetros;
    private double costoFinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private int numCuartos;
    private Constructora constructora;

    public Casa(Propietario prop, double preMe, double numMe, Barrio bar,
            Ciudad ciu, int numCuar, Constructora constr) {
        propietario = prop;
        precioMetroCuadrado = preMe;
        numMetros = numMe;
        barrio = bar;
        ciudad = ciu;
        numCuartos = numCuar;
        constructora = constr;
    }

    public void establecerProp(Propietario n) {
        propietario = n;
    }

    public void establecerPrecioMetroCuadrado(double meCua) {
        precioMetroCuadrado = meCua;
    }

    public void establecerNumMetros(double numMet) {
        numMetros = numMet;
    }

    public void establecerCostoFinal(double cosFin) {
        costoFinal = cosFin;
    }

    public void establecerBarrio(Barrio bar) {
        barrio = bar;
    }

    public void establecerCiudad(Ciudad ciu) {
        ciudad = ciu;
    }

    public void establecerNumCuartos(int numCuar) {
        numCuartos = numCuar;
    }

    public void establecerConstructora(Constructora construc) {
        constructora = construc;
    }

    public Propietario obtenerProp() {
        return propietario;
    }

    public double obtenerPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }

    public double obtenerNumMetros() {
        return numMetros;
    }

    public double obtenerCostoFinal() {
        return costoFinal;
    }

    public Barrio obtenerBarrio() {
        return barrio;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumCuartos() {
        return numCuartos;
    }

    public Constructora obtenerConstructora() {
        return constructora;
    }

}
