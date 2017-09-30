/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Estudiante
 */
public abstract class Ave extends Animal{
    
    private double altitudMax;
    private boolean adiestrada;
    private double tiempoVuelo;
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println(" Altitud máxima: " + getAltitudMax() +
                "\n Adiestramiento: " + isAdiestrada() +
                "\n Tiempo máximo de vuelo: " + getTiempoVuelo() + " min");        
    }

    public double getAltitudMax() {
        return altitudMax;
    }

    public void setAltitudMax(double altitudMax) {
        this.altitudMax = altitudMax;
    }

    public boolean isAdiestrada() {
        return adiestrada;
    }

    public void setAdiestrada(boolean adiestrada) {
        this.adiestrada = adiestrada;
    }

    public double getTiempoVuelo() {
        return tiempoVuelo;
    }

    public void setTiempoVuelo(double tiempoVuelo) {
        this.tiempoVuelo = tiempoVuelo;
    }
    
    
}
