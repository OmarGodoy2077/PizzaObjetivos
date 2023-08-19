package edu.ejercicios;

public class PizzaItaliana extends Pizza {
    private String salsa;
    private int tiempoEnHorno;

    public PizzaItaliana(String nombre, double precio, String salsa, int tiempoEnHorno) {
        super(nombre, precio);
        this.salsa = salsa;
        this.tiempoEnHorno = tiempoEnHorno;
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Agregando la salsa: " + salsa);
        System.out.println("Tiempo en el horno: " + tiempoEnHorno + " minutos");
    }

    @Override
    public String toString() {
        return super.toString() + ", salsa: " + salsa + ", tiempo en horno: " + tiempoEnHorno;
    }
}
