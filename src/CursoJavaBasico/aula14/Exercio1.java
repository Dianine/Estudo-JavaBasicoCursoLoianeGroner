package CursoJavaBasico.aula14;

import java.util.Scanner;

public class Exercio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com um numero: ");
		double n1 = sc.nextDouble();
		System.out.println("Entre com outro numero: ");
		double n2 = sc.nextDouble();
		
		
		if (n1 > n2) {
			System.out.println("O número 1 é maior: " + n1);	
		}else {
			System.out.println("O número 2 é maior: " + n2);
		}

	}

}
