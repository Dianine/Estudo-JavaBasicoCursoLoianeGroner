package CursoJavaBasico.aula14_Condicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com um numero: ");
		double n = sc.nextDouble();
		
		
		
		if (n < 0) {
			System.out.println("O n�mero digitado � Negativo!");	
		}else {
			System.out.println("O n�mero digitado � Positivo! ");
		}

	}

	}


