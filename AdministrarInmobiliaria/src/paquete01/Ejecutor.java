/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;
import paquete02.ArchivoEscrituraPropietario;
import paquete02.Propietario;
import paquete03.ArchivoEscrituraBarrio;
import paquete03.Barrio;
import paquete04.ArchivoEscrituraCiudad;
import paquete04.Ciudad;
import paquete05.ArchivoEscrituraConstructora;
import paquete05.Constructora;
import paquete06.ArchivoEscrituraCasa;
import paquete06.Casa;
import paquete06.Departamento;

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
        String nombreDoc = "data/propietario.data";
        System.out.println("Ingrese los nombres del Propietario");
        String nombreP = entrada.nextLine();
        System.out.println("ingrese los apellidos del Porpietario");
        String apellidosP = entrada.nextLine();
        System.out.println("Ingrese la identificacion del Propietario");
        String ID = entrada.nextLine();
        Propietario p1 = new Propietario(nombreP, apellidosP, ID);
        ArchivoEscrituraPropietario archivo1 = new ArchivoEscrituraPropietario(nombreDoc);

    }

    public static void ingresarBarrio() {
        Scanner entrada = new Scanner(System.in);
        String nombreDoc = "data/barrio.data";
        System.out.println("Ingrese el nombre del barrio");
        String barrio = entrada.nextLine();
        System.out.println("Ingrese una Referencia");
        String referencia = entrada.nextLine();
        Barrio b1 = new Barrio(barrio, referencia);
        ArchivoEscrituraBarrio archivo2 = new ArchivoEscrituraBarrio(nombreDoc);

    }

    public static void ingresarCiudad() {
        Scanner entrada = new Scanner(System.in);
        String nombreDoc = "data/ciudad.data";
        System.out.println("Ingrese el nombre de la Ciudad");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de la Provincia");
        String provincia = entrada.nextLine();
        Ciudad c1 = new Ciudad(ciudad,provincia);
        ArchivoEscrituraCiudad archivo2 = new ArchivoEscrituraCiudad(nombreDoc);

    }

    public static void ingresarConstructora() {
        Scanner entrada = new Scanner(System.in);
        String nombreDoc = "data/constructora.data";
        System.out.println("Ingrese el nombre de la Constructora");
        String nombreC = entrada.nextLine();
        System.out.println("Ingrese el ID de la Empresa");
        String ID = entrada.nextLine();
        Constructora c1 = new Constructora(nombreC,ID);
        ArchivoEscrituraConstructora archivo2 = new ArchivoEscrituraConstructora(nombreDoc);

    }

    public static void ingresarCasa() {
        Scanner entrada = new Scanner(System.in);
        String nombreDoc = "data/casa.data";
        /*System.out.println("Ingrese los nombres del Propietario");
        String nombreP = entrada.nextLine();
        System.out.println("ingrese los apellidos del Porpietario");
        String apellidosP = entrada.nextLine();
        System.out.println("Ingrese la identificacion del Propietario");
        String IDpropietario = entrada.nextLine();
        Propietario p1 = new Propietario(nombreP, apellidosP, IDpropietario);
        */System.out.println("Ingrese el precio por metro cuadrado");
        double precioMC = entrada.nextInt();
        System.out.println("Ingrese los metros cuadrados");
        int metrosC = entrada.nextInt();
        /*System.out.println("Ingrese el nombre del barrio");
        String barrio = entrada.nextLine();
        System.out.println("Ingrese una Referencia");
        String referencia = entrada.nextLine();
        Barrio b1 = new Barrio(barrio, referencia);
        System.out.println("Ingrese el nombre de la Ciudad");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de la Provincia");
        String provincia = entrada.nextLine();
        Ciudad c1 = new Ciudad(ciudad,provincia);
        */System.out.println("Ingrese el numero de Cuartos");
        int nCuartos = entrada.nextInt();
        /*System.out.println("Ingrese el nombre de la Constructora");
        String nombreC = entrada.nextLine();
        System.out.println("Ingrese el ID de la Empresa");
        String IDconstructora = entrada.nextLine();
        //Constructora cons1 = new Constructora(nombreC,IDconstructora);
        
        */
        ArchivoEscrituraCasa archivo2 = new ArchivoEscrituraCasa(nombreDoc);
        Casa casa1 = new Casa(casa1.obtenerProp(),precioMC,metrosC,b1,c1,nCuartos,cons1);
        
    }

    public static void ingresarDepartamento() {
        Scanner entrada = new Scanner(System.in);
        String nombreDoc = "data/departamento.data";
        System.out.println("Ingrese los nombres del Propietario");
        String nombreP = entrada.nextLine();
        System.out.println("ingrese los apellidos del Porpietario");
        String apellidosP = entrada.nextLine();
        System.out.println("Ingrese la identificacion del Propietario");
        String IDpropietario = entrada.nextLine();
        Propietario p1 = new Propietario(nombreP, apellidosP, IDpropietario);
        System.out.println("Ingrese el precio por metro cuadrado");
        double precioMC = entrada.nextInt();
        System.out.println("Ingrese los metros cuadrados");
        double metrosC = entrada.nextInt();
        System.out.println("Ingrese el valor de la alicuota mensual");
        double alicuota = entrada.nextInt();
        System.out.println("Ingrese el nombre del barrio");
        String barrio = entrada.nextLine();
        System.out.println("Ingrese una Referencia");
        String referencia = entrada.nextLine();
        Barrio b1 = new Barrio(barrio, referencia);
        System.out.println("Ingrese el nombre de la Ciudad");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de la Provincia");
        String provincia = entrada.nextLine();
        Ciudad c1 = new Ciudad(ciudad,provincia);
        System.out.println("Ingrese el nombre del edificio");
        String nombreE = entrada.nextLine();
        System.out.println("Ingrese la ubicacion del edificio");
        String ubicacion = entrada.nextLine();
        System.out.println("Ingrese el nombre de la Constructora");
        String nombreC = entrada.nextLine();
        System.out.println("Ingrese el ID de la Empresa");
        String IDconstructora = entrada.nextLine();
        Constructora cons1 = new Constructora(nombreC,IDconstructora);
        Departamento depa1 = new Departamento(p1,precioMC,metrosC,alicuota,b1,c1,nombreE,ubicacion,cons1);

    }

}
