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
public class Tortuga extends Reptil{
    
    private boolean tortuga_agua;
    private boolean caparazon;
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println(" Tortuga de agua: " + isTortuga_agua() +
                "\n Tiene caparazón: " + isCaparazon());        
    }

    public boolean isTortuga_agua() {
        return tortuga_agua;
    }

    public void setTortuga_agua(boolean tortuga_agua) {
        this.tortuga_agua = tortuga_agua;
    }

    public boolean isCaparazon() {
        return caparazon;
    }

    public void setCaparazon(boolean caparazon) {
        this.caparazon = caparazon;
    }
    
    
    
}
