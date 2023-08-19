package edu.ejercicios.Hijo;

import edu.ejercicios.Padre.Empleado;

public class ScrumMaster extends Empleado {

    private String Departamento;

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    @Override
    public String obntenerDetalles() {
        return super.obntenerDetalles() + "\nDepto\n" + this.getDepartamento();
        //return "Nombre"+this.getNombre()+"Sueldo"+this.getSueldo()+"Depto"+this.getDepartamento();

    }

    @Override
    public String toString() {
        return "nom:" + this.getNombre();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null)
            return false;

        return false;
    }


    public ScrumMaster(String nombre, Double sueldo, String departamento) {
        super(nombre, sueldo);
        Departamento = departamento;
    }
}
