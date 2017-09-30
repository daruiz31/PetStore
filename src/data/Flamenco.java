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
public class Flamenco extends Ave{
    
    private String origen;
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println(" Origen: " + getOrigen());        
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    
    
}
