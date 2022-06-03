/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;
import paquete02.ArchivoEscrituraPropietario;
import paquete02.ArchivoLecturaPropietario;
import paquete02.Propietario;
import paquete03.ArchivoEscrituraBarrio;
import paquete03.ArchivoLecturaBarrio;
import paquete03.Barrio;
import paquete04.ArchivoEscrituraCiudad;
import paquete04.ArchivoLecturaCiudad;
import paquete04.Ciudad;
import paquete05.ArchivoEscrituraConstructora;
import paquete05.ArchivoLecturaConstructora;
import paquete05.Constructora;
import paquete06.ArchivoEscrituraCasa;
import paquete06.ArchivoEscrituraDepartamento;
import paquete06.ArchivoLecturaCasa;
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
               ArchivoLecturaPropietario lec1 = new ArchivoLecturaPropietario(nombreDocPro);
        lec1.establecerPropietario(); // Sirve para presentar las Listas
        System.out.print(lec1);
        lec1.cerrarArchivo();
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
                                    if (num == 7) {
                                        menuPresentar();
                                    } else {
                                        System.out.println("Numero fuera del Rango");
                                    }
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
        String nombreDocPro = "data/propietario.data";
        System.out.println("Ingrese los nombres del Propietario");
        String nombreP = entrada.nextLine();
        System.out.println("ingrese los apellidos del Porpietario");
        String apellidosP = entrada.nextLine();
        System.out.println("Ingrese la identificacion del Propietario");
        String ID = entrada.nextLine();
        Propietario p1 = new Propietario(nombreP, apellidosP, ID);
        ArchivoEscrituraPropietario archivo1 = new ArchivoEscrituraPropietario(nombreDocPro);
        archivo1.establecerPropietario(p1);
        archivo1.establecerSalida();
        archivo1.cerrarArchivo();
        //Presentar
        ArchivoLecturaPropietario lec1 = new ArchivoLecturaPropietario(nombreDocPro);
        lec1.establecerPropietario(); // Sirve para presentar las Listas
        System.out.print(lec1);
        lec1.cerrarArchivo();


    }

    public static void ingresarBarrio() {
        Scanner entrada = new Scanner(System.in);
        String nombreDocBar = "data/barrio.data";
        System.out.println("Ingrese el nombre del barrio");
        String barrio = entrada.nextLine();
        System.out.println("Ingrese una Referencia");
        String referencia = entrada.nextLine();
        Barrio b1 = new Barrio(barrio, referencia);
        ArchivoEscrituraBarrio archivo2 = new ArchivoEscrituraBarrio(nombreDocBar);
        archivo2.establecerBarrio(b1);
        archivo2.establecerSalida();
        archivo2.cerrarArchivo();
        //Presentar
        ArchivoLecturaBarrio lec1 = new ArchivoLecturaBarrio(nombreDocBar);
        lec1.establecerBarrios();// Sirve para presentar las Listas
        System.out.print(lec1);
        lec1.cerrarArchivo();

    }

    public static void ingresarCiudad() {
        Scanner entrada = new Scanner(System.in);
        String nombreDocC = "data/ciudad.data";
        System.out.println("Ingrese el nombre de la Ciudad");
        String ciudad = entrada.nextLine(); 
        System.out.println("Ingrese el nombre de la Provincia");
        String provincia = entrada.nextLine();
        Ciudad c1 = new Ciudad(ciudad, provincia);
        ArchivoEscrituraCiudad archivo3 = new ArchivoEscrituraCiudad(nombreDocC);
        archivo3.establecerCiudad(c1);
        archivo3.establecerSalida();
        archivo3.cerrarArchivo();
        //Presentar
        ArchivoLecturaCiudad lec1 = new ArchivoLecturaCiudad(nombreDocC);
        lec1.establecerCiudades();// Sirve para presentar las Listas
        System.out.print(lec1);
        lec1.cerrarArchivo();

    }

    public static void ingresarConstructora() {
        Scanner entrada = new Scanner(System.in);
        String nombreDocCons = "data/constructora.data";
        System.out.println("Ingrese el nombre de la Constructora");
        String nombreC = entrada.nextLine();
        System.out.println("Ingrese el ID de la Empresa");
        String ID = entrada.nextLine();
        Constructora c1 = new Constructora(nombreC, ID);
        ArchivoEscrituraConstructora archivo4 = new ArchivoEscrituraConstructora(nombreDocCons);
        archivo4.establecerConstructura(c1);
        archivo4.establecerSalida();
        archivo4.cerrarArchivo();
        //Presentar 
        ArchivoLecturaConstructora lec1 = new ArchivoLecturaConstructora(nombreDocCons);
        lec1.establecerConstructoras();// Sirve para presentar las Listas
        System.out.print(lec1);
        lec1.cerrarArchivo();

    }

    public static void ingresarCasa() {
        Scanner entrada = new Scanner(System.in);
        String nombreDoc = "data/casa.data";
        System.out.println("Ingrese el precio por metro cuadrado");
        double precioMC = entrada.nextInt();
        System.out.println("Ingrese los metros cuadrados");
        int metrosC = entrada.nextInt();
        System.out.println("Ingrese el numero de Cuartos");
        int nCuartos = entrada.nextInt();

        //Propietario
        ArchivoLecturaPropietario lectura2 = new ArchivoLecturaPropietario(nombreDoc);
        System.out.println("Ingrese la Identificacion a buscar del propietario");
        String idpro = entrada.nextLine();
        lectura2.establecerCasaBuscada(idpro);
        if (lectura2.obtenerPropietarioBuscada() == null) {
            System.out.println("No se encontro Propietario - Ingrese uno nuevo");
            String nombreDocPro = "data/propietario.data";
            System.out.println("Ingrese los nombres del Propietario");
            String nombreP = entrada.nextLine();
            System.out.println("ingrese los apellidos del Porpietario");
            String apellidosP = entrada.nextLine();
            System.out.println("Ingrese la identificacion del Propietario");
            String ID = entrada.nextLine();
            Propietario p1 = new Propietario(nombreP, apellidosP, ID);
            ArchivoEscrituraPropietario archivo1 = new ArchivoEscrituraPropietario(nombreDocPro);
            archivo1.establecerPropietario(p1);
            archivo1.establecerSalida();
            archivo1.cerrarArchivo();
        }

        //Barrio
        ArchivoLecturaBarrio lectura3 = new ArchivoLecturaBarrio(nombreDoc);
        System.out.println("Ingrese el nombre del barrio a buscar ");
        String nombrebarr = entrada.nextLine();
        lectura3.establecerCasaBuscada(nombrebarr);
        if (lectura3.obtenerBarrioBuscada() == null) {
            System.out.println("No se encontro el Barrio - Ingrese uno nuevo");
            String nombreDocBar = "data/barrio.data";
            System.out.println("Ingrese el nombre del barrio");
            String barrio = entrada.nextLine();
            System.out.println("Ingrese una Referencia");
            String referencia = entrada.nextLine();
            Barrio b1 = new Barrio(barrio, referencia);
            ArchivoEscrituraBarrio archivo2 = new ArchivoEscrituraBarrio(nombreDocBar);
            archivo2.establecerBarrio(b1);
            archivo2.establecerSalida();
            archivo2.cerrarArchivo();
        }

        //Ciudad 
        ArchivoLecturaCiudad lectura4 = new ArchivoLecturaCiudad(nombreDoc);
        System.out.println("Ingrese el nombre de la Ciudad a buscar ");
        String nombreCiudad = entrada.nextLine();
        lectura4.establecerCiudadBuscada(nombreCiudad);
        if (lectura4.obtenerCiudadBuscada() == null) {
            System.out.println("No se encontro la Ciudad - Ingrese uno nuevo");
            String nombreDocC = "data/ciudad.data";
            System.out.println("Ingrese el nombre de la Ciudad");
            String ciudad = entrada.nextLine();
            System.out.println("Ingrese el nombre de la Provincia");
            String provincia = entrada.nextLine();
            Ciudad c1 = new Ciudad(ciudad, provincia);
            ArchivoEscrituraCiudad archivo3 = new ArchivoEscrituraCiudad(nombreDocC);
            archivo3.establecerCiudad(c1);
            archivo3.establecerSalida();
            archivo3.cerrarArchivo();
        }

        //Constructora
        ArchivoLecturaConstructora lectura5 = new ArchivoLecturaConstructora(nombreDoc);
        System.out.println("Ingrese el nombre de la Constructora a buscar ");
        String nombreConstr = entrada.nextLine();
        lectura5.establecerConstructoraBuscada(nombreConstr);
        if (lectura5.obtenerConstructuraBuscada() == null) {
            System.out.println("No se encontro la Constructora - Ingrese uno nuevo");
            String nombreDocCons = "data/constructora.data";
            System.out.println("Ingrese el nombre de la Constructora");
            String nombreC = entrada.nextLine();
            System.out.println("Ingrese el ID de la Empresa");
            String ID = entrada.nextLine();
            Constructora c1 = new Constructora(nombreC, ID);
            ArchivoEscrituraConstructora archivo4 = new ArchivoEscrituraConstructora(nombreDocCons);
            archivo4.establecerConstructura(c1);
            archivo4.establecerSalida();
            archivo4.cerrarArchivo();
        }

        Casa casa1 = new Casa(lectura2.obtenerPropietarioBuscada(), precioMC, metrosC,
                lectura3.obtenerBarrioBuscada(), lectura4.obtenerCiudadBuscada(), nCuartos, lectura5.obtenerConstructuraBuscada());
        ArchivoEscrituraCasa archivo5 = new ArchivoEscrituraCasa(nombreDoc);
        casa1.establecerCostoFinal();
        archivo5.establecerCasa(casa1);
        archivo5.establecerSalida();
        archivo5.cerrarArchivo();
        ArchivoLecturaCasa lec1 = new ArchivoLecturaCasa(nombreDoc);
        lec1.establecerCasas();
        System.out.print(lec1);
        lec1.cerrarArchivo();
        System.out.print(casa1);

    }

    public static void ingresarDepartamento() {
        Scanner entrada = new Scanner(System.in);
        String nombreDocDepar = "data/departamento.data";
        /*System.out.println("Ingrese los nombres del Propietario");
        String nombreP = entrada.nextLine();
        System.out.println("ingrese los apellidos del Porpietario");
        String apellidosP = entrada.nextLine();
        System.out.println("Ingrese la identificacion del Propietario");
        String IDpropietario = entrada.nextLine();
        Propietario p1 = new Propietario(nombreP, apellidosP, IDpropietario);
         */
        System.out.println("Ingrese el precio por metro cuadrado");
        double precioMC = entrada.nextInt();
        System.out.println("Ingrese los metros cuadrados");
        double metrosC = entrada.nextInt();
        System.out.println("Ingrese el valor de la alicuota mensual");
        double alicuota = entrada.nextInt();
        /*System.out.println("Ingrese el nombre del barrio");
        String barrio = entrada.nextLine();
        System.out.println("Ingrese una Referencia");
        String referencia = entrada.nextLine();
        Barrio b1 = new Barrio(barrio, referencia);
        System.out.println("Ingrese el nombre de la Ciudad");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de la Provincia");
        String provincia = entrada.nextLine();
        Ciudad c1 = new Ciudad(ciudad, provincia);
         */
        System.out.println("Ingrese el nombre del edificio");
        String nombreE = entrada.nextLine();
        System.out.println("Ingrese la ubicacion del edificio");
        String ubicacion = entrada.nextLine();
        /*System.out.println("Ingrese el nombre de la Constructora");
        String nombreC = entrada.nextLine();
        System.out.println("Ingrese el ID de la Empresa");
        String IDconstructora = entrada.nextLine();
        Constructora cons1 = new Constructora(nombreC, IDconstructora);
        
         */
        ArchivoEscrituraDepartamento dep1 = new ArchivoEscrituraDepartamento(nombreDocDepar);
        ArchivoLecturaPropietario lectura2 = new ArchivoLecturaPropietario(nombreDocDepar);
        ArchivoLecturaBarrio lectura3 = new ArchivoLecturaBarrio(nombreDocDepar);
        ArchivoLecturaCiudad lectura4 = new ArchivoLecturaCiudad(nombreDocDepar);
        ArchivoLecturaConstructora lectura5 = new ArchivoLecturaConstructora(nombreDocDepar);

        Departamento depa1 = new Departamento(lectura2.obtenerPropietarioBuscada(),
                precioMC, metrosC, alicuota, lectura3.obtenerBarrioBuscada(),
                lectura4.obtenerCiudadBuscada(), nombreE, ubicacion,
                lectura5.obtenerConstructuraBuscada());

    }
    public static void menuPresentar() {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        int num;
        String salir;
                
        do {
            System.out.printf("Menu de Opciones de Presentar\n1-Presentar "
                    + "Propietario\n"
                    + "2-Presentar Barrios\n3-Presentar Ciudades\n"
                    + "4-Presentar Cnstructoras\n5-Presentar casas\n"
                    + "6-Presentar DEpartamentos\nEliga una opción:\n");
            num = entrada.nextInt();
            if (num == 1) {
                
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
                                    if (num == 7) {
                                        menuPresentar();
                                    } else {
                                        System.out.println("Numero fuera del Rango");
                                    }
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
