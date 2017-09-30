/**
 *
 * @author diearuizmar
 */

package data;

public class Gato extends Mamifero{
    
    private String color;    
    
    public Gato(){
        
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Color: " + getColor());
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
