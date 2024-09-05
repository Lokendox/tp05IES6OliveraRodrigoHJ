package ar.edu.ies6.informatica.punto05.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String dni;
    private String nombre;
    private LocalDate fechanacimiento;
    private String provincia;
    public Persona() {
        this.provincia = "Jujuy";
    }
    public Persona(String dni, String nombre, LocalDate fechanacimiento, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.provincia = provincia;
    }
    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechanacimiento = fechaNacimiento;
        this.provincia = "Jujuy";
    }
    public String getdni() {
        return dni;
    }
    public void setdni(String dni) {
        this.dni = dni;
    }
    public String getnombre() {
        return nombre;
    }
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getfechanacimiento() {
        return fechanacimiento;
    }
    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int calcularEdad() {
        return Period.between(this.fechanacimiento, LocalDate.now()).getYears();
    }
    public boolean esMayorDeEdad() {
        return this.calcularEdad() >= 18;
    }
    public void mostrarDatos() {
        System.out.println("DNI: " + this.dni);
        System.out.println("nombre: " + this.nombre);
        System.out.println("decha de nacimiento: " + this.fechanacimiento);
        System.out.println("provincia: " + this.provincia);
        System.out.println("edad: " + this.calcularEdad());
        if (this.esMayorDeEdad()) {
            System.out.println("la persona es mayor");
        } else {
            System.out.println("la persona no es mayor");
        }
    }
}