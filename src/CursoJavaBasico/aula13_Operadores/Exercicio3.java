package CursoJavaBasico.aula13_Operadores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com Valor1: ");
		double valor1 = sc.nextDouble();
		System.out.print("Entre com Valor2: ");
		double valor2 = sc.nextDouble();
		
		double soma = valor1 + valor2;
		System.out.println("A soma é : " + soma);
		

	}

}
