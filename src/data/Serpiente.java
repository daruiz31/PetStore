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
public class Serpiente extends Reptil {

    private boolean venenosa;

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println(" Venenosa: " + isVenenosa());
    }

    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }

}
