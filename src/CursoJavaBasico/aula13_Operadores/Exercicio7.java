package CursoJavaBasico.aula13_Operadores;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com lado do quadrado: ");
		double lado = sc.nextDouble();
		
		//area = lado * lado
		double area = Math.pow(lado, 2);
		
		System.out.println(" A area do quadrado é : " + area);
		System.out.println(" O dobro da area é : " + area * 2);
		
			
	}

}
