package ar.edu.ies6.informatica.punto05;

import ar.edu.ies6.informatica.punto05.model.Persona;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setdni("41654098");
        persona1.setnombre("Olivera Rodrigo");
        persona1.setFechanacimiento(LocalDate.of(1999, 1, 9));
        persona1.mostrarDatos();

        System.out.println();
        Persona persona2 = new Persona("41654099", "Harry Lopez", LocalDate.of(1995, 2, 20), "Buenos Aires");
        persona2.mostrarDatos();

        System.out.println();
        Persona persona3 = new Persona("41654095", "tomy Ramos", LocalDate.of(1998, 4, 10));
        persona3.mostrarDatos();
    }
}