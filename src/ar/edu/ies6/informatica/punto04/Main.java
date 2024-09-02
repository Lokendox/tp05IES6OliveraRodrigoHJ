package ar.edu.ies6.informatica.punto04;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa un número entre 1 y 9: ");
        int numero = scanner.nextInt();
        if (numero < 1 | numero > 9) {
            System.out.println("el número debe estar entre 1 y 9.");
        } else {
            System.out.println("tabla de multiplicar del " + numero + ":"); 
            for (int nu = 1; nu <= 10; nu++) {
                int resultado = numero * nu;
                System.out.println(numero + " x " + nu + " = " + resultado);
            }
        }

        scanner.close();
	}

}
