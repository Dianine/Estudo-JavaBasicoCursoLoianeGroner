package CursoJavaBasico.aula14;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com Primeiro N�mero: ");
		int n1 = sc.nextInt();
		
		System.out.print("Entre com Segundo N�mero: ");
		int n2 = sc.nextInt();
		
		System.out.print("Entre com Terceiro N�mero: ");
		int n3 = sc.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("O Primeiro � o MAIOR: " + n1);
		}else if (n2 > n1 && n2 > n3) {
			System.out.println("O Segundo � o MAIOR: " + n2);
		}else if (n3 > n1 && n3 > n2) {
			System.out.println("O Terceiro � o MAIOR: " + n3);
		}

	}

}
