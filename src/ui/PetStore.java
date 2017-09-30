/**
 *
 * @author diearuizmar
 */
package ui;

import business.Store;

public class PetStore {
    
       
    public static void bienvenida() {
        
        System.out.println("-----------------------------------------------");
        System.out.println("                BIENVENIDO");
        System.out.println("                 PetStore");
        System.out.println("-----------------------------------------------");
        System.out.println(" ");        
    }

    public static void main(String[] args) {
        Store tienda = new Store();
        bienvenida();        
        tienda.mostrarCatalogo();        
    }
}

