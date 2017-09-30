/**
 *
 * @author Estudiante
 */

package data;

public class Aguila extends Ave{
    private double longPico;
    private String tipo;
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println(" Longitud del pico: " + getLongPico() + " cm" +
                "\n Tipo de aguila: " + getTipo());        
    }

    public double getLongPico() {
        return longPico;
    }

    public void setLongPico(double longPico) {
        this.longPico = longPico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
