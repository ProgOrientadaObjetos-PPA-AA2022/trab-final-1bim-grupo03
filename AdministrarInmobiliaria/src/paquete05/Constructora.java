/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author JonathanCoronel
 */
public class Constructora {

    private String nombreConstructora;
    private String idEmpresa;

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
