/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author JonathanCoronel y Pablo Figueroa
 */
public class Ciudad {

    private String nombreCiudad;
    private String nombreProvinvcia;
    
    public Ciudad(String nomCiu,String nomProv){
        nombreCiudad = nomCiu;
        nombreProvinvcia = nomProv;
    }
    public void establecerNombreCiudad(String n) {
        nombreCiudad = n;
    }

    public void establecerNombreProvincia(String n) {
        nombreProvinvcia = n;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public String obtenerNombreProvincia() {
        return nombreProvinvcia;
    }
}
