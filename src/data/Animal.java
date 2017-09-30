/**
 *
 * @author diearuizmar
 */
package data;


public abstract class Animal {
    
    private String nombre;
    private double peso;
    private int edad;
    private String genero;    
    private double precio;
    
    public Animal(){
        
    }
    
    public void imprimirDatos(){
        System.out.println(" Nombre: " + getNombre() + "\n Peso: " + getPeso() + " Kg. " +
                "\n Edad: " + getEdad() + " mes(es) " + "\n Genero: " + getGenero() +
                "\n Precio: $" + getPrecio() + " dolares" );        
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
