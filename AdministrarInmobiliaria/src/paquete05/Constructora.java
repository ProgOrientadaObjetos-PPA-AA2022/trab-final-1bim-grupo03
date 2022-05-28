/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author JonathanCoronel y Pablo Figueroa
 */
public class Constructora {

    private String nombreConstructora;
    private String idEmpresa;

    public Constructora(String nomConstru, String idEmpre) {
        nombreConstructora = nomConstru;
        idEmpresa = idEmpre;
    }

    public void establecerNombreConstructora(String n) {
        nombreConstructora = n;
    }

    public void establecerIdEmpresa(String n) {
        idEmpresa = n;
    }

    public String obtenerNombreCiudad() {
        return nombreConstructora;
    }

    public String obtenerNombreProvincia() {
        return idEmpresa;
    }
}
