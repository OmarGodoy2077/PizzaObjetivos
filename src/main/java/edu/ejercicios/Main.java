
       package edu.ejercicios;

import edu.ejercicios.Hijo.ScrumMaster;
import edu.ejercicios.Padre.Empleado;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
        public class Main {



            public  static void imprime(Empleado emp){
                System.out.println("objeto"+emp.obntenerDetalles());


            }
            public static void main(String[] args) {
                Empleado em= new Empleado("Nombre",3500.0);
imprime(em);

                //em.setNombre("Garrido");
                //em.setSueldo(3500.0);
                //System.out.println(em.obntenerDetalles());
                //System.out.println("nombre"+em.getNombre()+"Sueldo"+ em.getSueldo());
                //System.out.println(em.toString());
                ScrumMaster sm= new ScrumMaster("Juan",4500031.0,"Informatica");
                //System.out.println(sm. toString());
                //System.out.println(sm.obntenerDetalles());
                //System.out.println(sm.toString());
                ScrumMaster sm1= new ScrumMaster("Juan",4500031.0,"Informatica");
                //System.out.println("emp scrum"+(em==sm));
                System.out.println("emp scrum"+(sm==sm1));
    if (sm.equals(sm1)){
        System.out.println("Son iguales");
        System.out.println(sm.toString());
    }
    else {
        System.out.println("No son iguales");
    }
                // Crear una pizza básica
                Pizza pizzaBasica = new Pizza("Pizza Margarita", 10.0);
                pizzaBasica.agregarIngrediente("Queso");
                pizzaBasica.agregarIngrediente("Tomate");

                System.out.println("Detalles de la pizza básica:");
                System.out.println(pizzaBasica);
                pizzaBasica.preparar();
                System.out.println();

                // Crear una pizza italiana
                PizzaItaliana pizzaItaliana = new PizzaItaliana("Pizza Pepperoni", 12.0, "Salsa Marinara", 15);
                pizzaItaliana.agregarIngrediente("Queso");
                pizzaItaliana.agregarIngrediente("Pepperoni");

                System.out.println("Detalles de la pizza italiana:");
                System.out.println(pizzaItaliana);
                pizzaItaliana.preparar();
                System.out.println();

                // Agregar un topping a una pizza
                Topping champinones = new Topping("Champiñones");
                champinones.agregar(pizzaBasica);

                System.out.println("Detalles de la pizza básica con champiñones:");
                System.out.println(pizzaBasica);
                pizzaBasica.preparar();

            }


    }




