/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import java.io.Serializable;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author JonathanCoronel y Pablo Figueroa
 */
public class Departamento implements Serializable {

    private Propietario propietario;
    private double precioMetroCuadrado;
    private double numMetros;
    private double valorAlicuota;
    private double costoFinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private String nombreEdificio;
    private String ubicacion;
    private Constructora constructora;

    public Departamento(Propietario prop, double preMe, double numMe,
            double alicu, Barrio bar, Ciudad ciu, String nomEdi, String ubi,
            Constructora constr) {
        propietario = prop;
        precioMetroCuadrado = preMe;
        numMetros = numMe;
        valorAlicuota = alicu;
        barrio = bar;
        ciudad = ciu;
        nombreEdificio = nomEdi;
        ubicacion = ubi;
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

    public void establecerValorAlicuota(double valALicu) {
        valorAlicuota = valALicu;
    }

    public void establecerCostoFinal(double cosFinal) {
        valorAlicuota = cosFinal;
    }

    public void establecerBarrio(Barrio bar) {
        barrio = bar;
    }

    public void establecerCiudad(Ciudad ciu) {
        ciudad = ciu;
    }

    public void establecerNombreEdificio(String nomEdi) {
        nombreEdificio = nomEdi;
    }

    public void establecerUbicacion(String ubi) {
        ubicacion = ubi;
    }

    public void establecerConstructora(Constructora construc) {
        constructora = construc;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    public double obtenerPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }

    public double obtenerNumMetros() {
        return numMetros;
    }

    public double obtenerValorAlicuota() {
        return valorAlicuota;
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

    public String obtenerNombreEdificio() {
        return nombreEdificio;
    }

    public String obtenerUbicacion() {
        return ubicacion;
    }

    public Constructora obtenerConstructora() {
        return constructora;
    }

}
