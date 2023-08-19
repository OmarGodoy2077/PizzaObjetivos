package edu.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nombre;
    private double precio;
    private List<String> ingredientes;

    public Pizza(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = new ArrayList<>();
    }

    public void preparar() {
        System.out.println("La pizza está lista para ser servida.");
    }

    @Override
    public String toString() {
        return "nombre de la pizza: " + nombre + ", y su precio es: " + precio;
    }

    public void agregarIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }
}