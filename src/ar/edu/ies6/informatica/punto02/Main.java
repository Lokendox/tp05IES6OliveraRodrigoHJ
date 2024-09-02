package ar.edu.ies6.informatica.punto02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresa un número entero: ");
		int numero=sc.nextInt();
		
		if (numero % 2 == 0) {
			int numerotriple = numero *3;
			System.out.println("nuemro es par. "+ numerotriple);
		}else {
			System.out.println("nuemro es impar. "+ 2*numero);
		}
		sc.close();
	}

}
