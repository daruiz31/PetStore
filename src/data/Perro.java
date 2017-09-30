/**
 *
 * @author diearuizmar
 */

package data;

public class Perro extends Mamifero{
    
    private String raza;
    
    public Perro(){
        
    }
    
    @Override
    public void imprimirDatos(){        
        super.imprimirDatos();
        System.out.println("Raza: " + getRaza());
    }   

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}
