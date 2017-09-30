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
public abstract class Reptil extends Animal{
    
    private double largo;
    private int numPatas;
    private String ecosistema;
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println(" Largo: " + getLargo() + " cm" + "\n Número de patas: " +
                getNumPatas() + "\n Ecosistema natural: " + getEcosistema());
        
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getEcosistema() {
        return ecosistema;
    }

    public void setEcosistema(String ecosistema) {
        this.ecosistema = ecosistema;
    }
    
    
    
}
