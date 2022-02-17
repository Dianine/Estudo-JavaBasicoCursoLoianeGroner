package CursoJavaBasico.aula14;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com Primeiro número: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Entre com Segundo número: ");
		double n2 = sc.nextDouble();

		System.out.print("Entre com Terceiro número: ");
		double n3 = sc.nextDouble();
		
		System.out.println();
		
		if(n1 > n2 || n1 > n3) {
			System.out.println("O primeiro numro é Maior: " + n1);
		}else if (n2 > n1 && n2 > n3) {
			System.out.println("O segundo é Maior: " + n2);
		}else if (n3 > n1 || n3 > n2) {
			System.out.println("O terceiro é Maior: " + n3);
		}
		
		
		if(n1 < n2 || n1 < n3) {
			System.out.println("O primeiro numro é Menor: " + n1);
		}else if (n2 < n1 && n2 < n3) {
			System.out.println("O segundo é Menor: " + n2);
		}else if (n3 < n1 || n3 < n2) {
			System.out.println("O terceiro é Menor: " + n3);
	}
}}
