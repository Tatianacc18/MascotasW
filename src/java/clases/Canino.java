package clases;

public class Canino extends Mascotas{
    
    private final String nivelDeEntrenamiento;

    public Canino(String nombre, String raza, String color, int edad, String nivelDeEntrenamiento) {
        super(nombre, raza, color, edad);
        this.nivelDeEntrenamiento = nivelDeEntrenamiento;
    }
    
    public String nivelEntrenamiento(){
        return nivelDeEntrenamiento;
    }

    @Override
    public int edadPromedio() {
        return getEdad();
    }
}
