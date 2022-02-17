package CursoJavaBasico.aula13_Operadores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com Numero Inteiro : ");
		int num1 = sc.nextInt();
		System.out.print("Entre com outro Numero Inteiro : ");
		int num2 = sc.nextInt();
		System.out.print("Entre com Numero Real : ");
		double num3 = sc.nextInt();
		
		int resultado1 = (num1 * 2 ) * (num2 /2);
		double resultado2 = (num1 * 3 )+ num3;
		double resultado3 = Math.pow(num3, 3);
		
		System.out.println("Resultado 1 : " + resultado1);
		System.out.println("Resultado 2 : " + resultado2);
		System.out.println("Resultado 3 : " + resultado3);
	}

}
