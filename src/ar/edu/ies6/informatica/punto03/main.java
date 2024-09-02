package ar.edu.ies6.informatica.punto03;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("ingresa un número entre 0 y 10: ");
        int numero = sc.nextInt();
        if (numero < 0 | numero > 10) {
            System.out.println("el número debe estar entre 0 y 10.");
        } else {
            int factorial = 1;
            int contador = 1;
            while (contador <= numero) {
                factorial *= contador;
                contador++;
            }

            System.out.println("el factorial de " + numero + "! es: " + factorial);
        }

        sc.close();
    
	}

}
