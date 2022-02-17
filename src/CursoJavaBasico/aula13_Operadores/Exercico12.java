package CursoJavaBasico.aula13_Operadores;

import java.util.Scanner;

public class Exercico12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Entre com a Altura: ");
		double altura = sc.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Seu Peso Ideal seria de : " + pesoIdeal + " Kg");
		
		
		
	}

}
