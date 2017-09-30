/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import data.Perro;
import data.Gato;
import data.Tortuga;
import data.Serpiente;
import data.Aguila;
import data.Flamenco;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author darui
 */
public class Catalog {

    static Pet mascotas = new Pet();

    public static boolean mamiferos() {
        Scanner seleccion = new Scanner(System.in);
        System.out.println(" -- Mamiferos -- ");
        System.out.println("Ingresa el numeral de la mascota para ver su información");
        System.out.println("1. Perros");
        System.out.println("2. Gatos");
        System.out.println("0. Otros");
        System.out.println("-1. Salir");
        int n = seleccion.nextInt();

        if (n < 0) {
            System.exit(0);
        } else if (n == 0) {
            return false;
        } else {
            if (n == 1) { // Perros
                ArrayList<Perro> listaPerros = mascotas.Dog(1);
                for (int j = 0; j < listaPerros.size(); j++) {
                    System.out.println(" **** --------------------------------- **** ");
                    listaPerros.get(j).imprimirDatos();
                    System.out.println(" -----------------------------------------");
                }
            } else if (n == 2) { // Gatos
                ArrayList<Gato> listaGatos = mascotas.Gat(1);
                for (int j = 0; j < listaGatos.size(); j++) {
                    System.out.println(" **** --------------------------------- **** ");
                    listaGatos.get(j).imprimirDatos();
                    System.out.println(" -----------------------------------------");
                }

            } else {
                return false;
            }
        }

        return true;
    }

    public static boolean reptiles() {
        Scanner seleccion = new Scanner(System.in);
        System.out.println(" -- Reptiles -- ");
        System.out.println("Ingresa el numeral de la mascota para ver su información");
        System.out.println("1. Tortugas");
        System.out.println("2. Serpientes");
        System.out.println("0. Otros");
        System.out.println("-1. Salir");
        int n = seleccion.nextInt();

        if (n < 0) {
            System.exit(0);
        } else if (n == 0) {
            return false;
        } else {
            if (n == 1) { // Tortugas
                ArrayList<Tortuga> listaTortugas = mascotas.Turtle(1);
                for (int j = 0; j < listaTortugas.size(); j++) {
                    System.out.println(" **** --------------------------------- **** ");
                    listaTortugas.get(j).imprimirDatos();
                    System.out.println(" -----------------------------------------");
                }

            } else if (n == 2) { // Serpientes
                ArrayList<Serpiente> listaSerpientes = mascotas.Snake(1);
                for (int j = 0; j < listaSerpientes.size(); j++) {
                    System.out.println(" **** --------------------------------- **** ");
                    listaSerpientes.get(j).imprimirDatos();
                    System.out.println(" -----------------------------------------");
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public static boolean aves() {
        Scanner seleccion = new Scanner(System.in);
        System.out.println(" -- Aves -- ");
        System.out.println("Ingresa el numeral de la mascota para ver su información");
        System.out.println("1. Aguilas");
        System.out.println("2. Flamencos");
        System.out.println("0. Otros");
        System.out.println("-1. Salir");
        int n = seleccion.nextInt();

        if (n < 0) {
            System.exit(0);
        } else if (n == 0) {
            return false;
        } else {
            if (n == 1) { // Aguilas
                ArrayList<Aguila> listaAguilas = mascotas.Eagle(1);
                for (int j = 0; j < listaAguilas.size(); j++) {
                    System.out.println(" **** --------------------------------- **** ");
                    listaAguilas.get(j).imprimirDatos();
                    System.out.println(" -----------------------------------------");
                }

            } else if (n == 2) { // Flamencos
                ArrayList<Flamenco> listaFlamencos = mascotas.Phoenicopterus(1);
                for (int j = 0; j < listaFlamencos.size(); j++) {
                    System.out.println(" **** --------------------------------- **** ");
                    listaFlamencos.get(j).imprimirDatos();
                    System.out.println(" -----------------------------------------");
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public static boolean verCatalogo() {
        boolean opcion = true;
        opcion = mamiferos();
        if (!opcion) {
            opcion = reptiles();
            if (!opcion) {
                opcion = aves();
                if (!opcion) {
                    System.out.println(" Lo sentimos, aun no tenemos más mascotas para ti.");
                    return false;
                }
            }
        }
        return opcion;
    }
}
