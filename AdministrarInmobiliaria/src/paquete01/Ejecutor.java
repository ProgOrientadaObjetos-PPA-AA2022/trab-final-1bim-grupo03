/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;

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

    public static void ingresarPropietario() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los nombres del Propietario");
        String nombreP = entrada.nextLine();
        System.out.println("ingrese los apellidos del Porpietario");
        String apellidosP = entrada.nextLine();
        System.out.println("Ingrese la identificacion del Propietario");
        String ID = entrada.nextLine();
        Propietario p1 = new Propietario(nombreP, apellidosP, ID);

    }

    public static void ingresarBarrio() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del barrio");
        String barrio = entrada.nextLine();
        System.out.println("Ingrese una Referencia");
        String referencia = entrada.nextLine();
        Barrio b1 = new Barrio(barrio, referencia);

    }

    public static void ingresarCiudad() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la Ciudad");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de la Provincia");
        String provincia = entrada.nextLine();
        Ciudad c1 = new Ciudad(ciudad,provincia);

    }

    public static void ingresarConstructora() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la Constructora");
        String nombreC = entrada.nextLine();
        System.out.println("Ingrese el ID de la Empresa");
        String ID = entrada.nextLine();
        Ciudad c1 = new Ciudad(nombreC,ID);

    }

    public static void ingresarCasa() {
        

    }

    public static void ingresarDepartamento() {

    }

}
