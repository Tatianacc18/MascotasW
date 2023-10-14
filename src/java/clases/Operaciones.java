/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import javax.servlet.ServletContext;

/**
 *
 * @author Atati
 */
public class Operaciones {
    ArrayList<Mascotas> mascota = new ArrayList<>();
    public void ObtenerValoresCanino(String nombre, String raza, String color, int edad, String nivelEntrenamiento){
         Canino nuevoCanino = new Canino(nombre, raza, color, edad,nivelEntrenamiento);
//         ServletContext context = ServletActionContext.getServletContext();
         mascota.add(nuevoCanino);
//         context.setAttribute("listaMascotas", mascota);
    }
    
    public void ObtenerValoresFelino(String nombre, String raza, String color, int edad, String libresDeTaxoplasmosis){
        Felino nuevoFelino = new Felino(nombre, raza, color, edad, libresDeTaxoplasmosis);
//        ServletContext context = ServletActionContext.getServletContext();
        mascota.add(nuevoFelino);
//        context.setAttribute("listaMascotas", mascota);
    }
    
    
}
