package CursoJavaBasico.aula13;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Entre com Temperatura em Graus Celsius: ");
		double celsius = sc.nextDouble();
		
		double fah = (celsius * 9/5) +32;
		System.out.println("A temperatura em Fahrenheit � " + fah + " Graus");

	}

}
