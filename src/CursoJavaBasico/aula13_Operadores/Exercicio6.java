package CursoJavaBasico.aula13_Operadores;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double pi = 3.14;
		
		System.out.println("Entre com Raio: ");
		double raio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2); //função PI e (raio x potencia)
		
		System.out.printf("A area é de :" + area);

	}

}
