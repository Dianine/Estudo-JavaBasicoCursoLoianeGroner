package CursoJavaBasico.aula16;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digitye um numero: ");
		int n = sc.nextInt();

		for (int i= 0; i <= n; i++ ) {
			System.out.println("I é : " + i);
		}
		System.out.println();
		
		for (int i = 5; i >= 0; i--) {
			System.out.println("I é igual: " + i);
		}
		System.out.println();
		
		for (int i = 0, j = n; i < n; i++, j--) {
			System.out.println("I é: " + i + "; -- J é: "+ j);
		}
		System.out.println();
		//Somando
		
		int soma= 0;
		for (int i = 1; i < n; soma+= i++);
			System.out.println("Soma é: " + soma);
		}
	}


