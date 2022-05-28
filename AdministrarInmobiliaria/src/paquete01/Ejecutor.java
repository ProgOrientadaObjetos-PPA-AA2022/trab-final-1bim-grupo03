/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author JonathanCoronel y Pablo Figueroa
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        int num;
        String salir;
        do {
            System.out.printf("Menu de Opciones\n1-Ingresar un propietario\n"
                    + "2-Ingresar un Barrio\n3-Ingresar una Ciudad\n"
                    + "4-Ingresar Constructora\n5-Ingresar una Casa\n"
                    + "6-Ingresar un Departamento\nIngrese un numero:\n");
            num = entrada.nextInt();
            if (num == 1) {
                ingresarPropietario();
            } else {
                if (num == 2) {
                    ingresarBarrio();
                } else {
                    if (num == 3) {
                        ingresarCiudad();
                    } else {
                        if (num == 4) {
                            ingresarConstructora();
                        } else {
                            if (num == 5) {
                                ingresarCasa();
                            } else {
                                if (num == 6) {
                                    ingresarDepartamento();
                                } else {
                                    System.out.println("Numero fuera del Rango");
                                }
                            }
                        }
                    }
                }
            }
            entrada.nextLine();
            System.out.println("Para salir del Programa digite n o para "
                    + "continuar cualquier otra letra");
            salir = entrada.nextLine();
            if (salir.equals("n")) {
                bandera = false;
            }
        } while (bandera);
    }
    
}
