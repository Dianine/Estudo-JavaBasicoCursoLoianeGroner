package CursoJavaBasico.aula13_Operadores;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Entre com a Temperatura em Fahrenheit: ");
		double fah = sc.nextDouble();
		
		double celsius = (fah-32) * 5/9;
		
		System.out.println("A temperatura em Celsius é : " + celsius + " Graus");
	}

}
