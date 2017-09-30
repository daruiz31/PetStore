/**
 *
 * @author diearuizmar
 */
package business;

import data.Aguila;
import data.Flamenco;
import data.Gato;
import data.Perro;
import data.Serpiente;
import data.Tortuga;
import java.util.ArrayList;

public class Pet {

    public ArrayList<Perro> Dog(int n) {
        ArrayList<Perro> perros = new ArrayList<>();
        String[] vacunas = {"Pulgas", "Gripe"};
        String[] enfermedades = {"Alergia a los materiales fosfóricos", "Pequeña lesión en pierna derecha"};
        for (int i = 0; i < n; i++) {
            perros.add(agregarPerro("Luna", 2.3, i + 1, "Femenino", 25, true, vacunas, enfermedades, "Labrador"));
        }
        return perros;
    }

    public ArrayList<Gato> Gat(int n) {
        ArrayList<Gato> gatos = new ArrayList<>();
        String[] vacunas = {"Gripe III", "Gripe IV"};
        String[] enfermedades = {"Asmatico"};
        for (int i = 0; i < n; i++) {
            gatos.add(agregarGato("Misifú", 2.3, i + 1, "Masculino", 22, true, vacunas, enfermedades, "Blanco manchado"));
        }
        return gatos;
    }

    public ArrayList<Tortuga> Turtle(int n) {
        ArrayList<Tortuga> tortuga = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tortuga.add(agregarTortuga("Luu", 23.4, i + 1, "Masculino", 27, 56, 4, "Pácifico", true, true));
        }
        return tortuga;
    }

    public ArrayList<Serpiente> Snake(int n) {
        ArrayList<Serpiente> serpiente = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            serpiente.add(agregarSerpiente("Snake", 3.2, i + 1, "Femenino", 49.99, 356, 0, "Sabana", false));
        }
        return serpiente;
    }

    public ArrayList<Aguila> Eagle(int n) {
        ArrayList<Aguila> aguila = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            aguila.add(agregarAguila("Guachú", 18.9, i + 1, "Femenino", 68.9, 356, true, 23.5, 7.2, "Águila Real"));
        }
        return aguila;
    }

    public ArrayList<Flamenco> Phoenicopterus(int n) {
        ArrayList<Flamenco> flamenco = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            flamenco.add(agregarFlamenco("Cirus", 33.9, i + 1, "Masculino", 99.99, 100, false, 5, "Oriental"));
        }
        return flamenco;
    }

    public static Perro agregarPerro(String nombre, double peso, int edad, String genero, double precio, boolean adiestrado, String[] vacunas, String[] enfermedades, String raza) {
        Perro perro = new Perro();
        perro.setNombre(nombre);
        perro.setPeso(peso);
        perro.setEdad(edad);
        perro.setGenero(genero);
        perro.setPrecio(precio);
        perro.setAdiestrado(adiestrado);
        perro.setVacunas(vacunas);
        perro.setEnfermedades(enfermedades);
        perro.setRaza(raza);

        return perro;
    }

    public static Gato agregarGato(String nombre, double peso, int edad, String genero, double precio, boolean adiestrado, String[] vacunas, String[] enfermedades, String color) {
        Gato gato = new Gato();
        gato.setNombre(nombre);
        gato.setPeso(peso);
        gato.setEdad(edad);
        gato.setGenero(genero);
        gato.setPrecio(precio);
        gato.setAdiestrado(adiestrado);
        gato.setVacunas(vacunas);
        gato.setEnfermedades(enfermedades);
        gato.setColor(color);

        return gato;
    }

    public static Tortuga agregarTortuga(String nombre, double peso, int edad, String genero, double precio, double largo, int numPatas, String ecosistema, boolean tortuga_agua, boolean caparazon) {
        Tortuga tortuga = new Tortuga();
        tortuga.setNombre(nombre);
        tortuga.setPeso(peso);
        tortuga.setEdad(edad);
        tortuga.setGenero(genero);
        tortuga.setPrecio(precio);
        tortuga.setLargo(largo);
        tortuga.setNumPatas(numPatas);
        tortuga.setEcosistema(ecosistema);
        tortuga.setTortuga_agua(tortuga_agua);
        tortuga.setCaparazon(caparazon);

        return tortuga;
    }

    public static Serpiente agregarSerpiente(String nombre, double peso, int edad, String genero, double precio, double largo, int numPatas, String ecosistema, boolean venenosa) {
        Serpiente serpiente = new Serpiente();
        serpiente.setNombre(nombre);
        serpiente.setPeso(peso);
        serpiente.setEdad(edad);
        serpiente.setGenero(genero);
        serpiente.setPrecio(precio);
        serpiente.setLargo(largo);
        serpiente.setNumPatas(numPatas);
        serpiente.setEcosistema(ecosistema);
        serpiente.setVenenosa(venenosa);

        return serpiente;
    }

    public static Aguila agregarAguila(String nombre, double peso, int edad, String genero, double precio, double altitudMax, boolean adiestrado, double tiempoVuelvo, double longPico, String tipo) {
        Aguila aguila = new Aguila();
        aguila.setNombre(nombre);
        aguila.setPeso(peso);
        aguila.setEdad(edad);
        aguila.setGenero(genero);
        aguila.setPrecio(precio);
        aguila.setAltitudMax(altitudMax);
        aguila.setAdiestrada(adiestrado);
        aguila.setTiempoVuelo(tiempoVuelvo);
        aguila.setLongPico(longPico);
        aguila.setTipo(tipo);

        return aguila;
    }

    public static Flamenco agregarFlamenco(String nombre, double peso, int edad, String genero, double precio, double altitudMax, boolean adiestrado, double tiempoVuelvo, String origen) {
        Flamenco flamenco = new Flamenco();
        flamenco.setNombre(nombre);
        flamenco.setPeso(peso);
        flamenco.setEdad(edad);
        flamenco.setGenero(genero);
        flamenco.setPrecio(precio);
        flamenco.setAltitudMax(altitudMax);
        flamenco.setAdiestrada(adiestrado);
        flamenco.setTiempoVuelo(tiempoVuelvo);
        flamenco.setOrigen(origen);

        return flamenco;
    }

}
