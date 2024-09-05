package ar.edu.ies6.informatica.punto05;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String provincia;
    
    public Persona() {
        this.provincia = "Jujuy";
    }
    public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = provincia;
    }
    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = "Jujuy";
    }
    
    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        return edad;
    }
    public boolean esmayorDeEdad() {
        return calcularEdad() >= 18;
    }
    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("nombre: " + nombre);
        System.out.println("fecha de nacimiento: " + fechaNacimiento);
        System.out.println("provincia: " + provincia);

        if (esmayorDeEdad()) {
            System.out.println("la persona es mayor de edad.");
        } else {
            System.out.println("la persona no es mayor de edad.");
		
        }
	}

}
