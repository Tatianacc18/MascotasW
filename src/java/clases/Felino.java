package clases;

public class Felino extends Mascotas {
    
    private String libresDeTaxoplasmosis;

    public Felino(String nombre, String raza, String color, int edad, String libresDeTaxoplasmosis) {
        super(nombre, raza, color, edad);
        this.libresDeTaxoplasmosis = libresDeTaxoplasmosis;
    }
    
    public String libreDeTaxoplasmosis(){
        return libresDeTaxoplasmosis;
    }

    @Override
    public int edadPromedio() {
        return getEdad();
    }  
    
}
