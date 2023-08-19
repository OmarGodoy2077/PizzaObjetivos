package edu.ejercicios.Padre;

public class Empleado {
    private String nombre;
    private Double sueldo;


    public String obntenerDetalles(){
        return  "Nombre:\n "+this.getNombre()+"\n Sueldo: \n"+this.getSueldo();

    }

    public String getNombre() {
        return nombre;
    }

    public Empleado(String nombre, Double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

}
