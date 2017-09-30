/**
 *
 * @author diearuizmar
 */
package data;


public abstract class Mamifero extends Animal{
    
    private boolean adiestrado;
    private String[] vacunas;
    private String[] enfermedades;
    
    public Mamifero(){
        
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println(" Adiestramiento: " + isAdiestrado() + "\n Vacunas:");
        for (String vacuna: getVacunas()) {
            System.out.println(" - " + vacuna);
        }
        System.out.println("Enfermedades: ");
        for (String enfermedad: getEnfermedades()) {
            System.out.println(" - " + enfermedad);
        }
    }
    
    public boolean isAdiestrado() {
        return adiestrado;
    }

    public void setAdiestrado(boolean adiestrado) {
        this.adiestrado = adiestrado;
    }

    public String[] getVacunas() {
        return vacunas;
    }

    public void setVacunas(String[] vacunas) {
        this.vacunas = vacunas;
    }

    public String[] getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String[] enfermedades) {
        this.enfermedades = enfermedades;
    }
}
