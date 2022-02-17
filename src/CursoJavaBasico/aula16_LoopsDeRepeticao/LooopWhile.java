package CursoJavaBasico.aula16_LoopsDeRepeticao;

import java.util.Scanner;

public class LooopWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um Numero: ");
		int n = sc.nextInt();
		
		int i = 1;
		
		while(i <= n) {
			System.out.println("Imprima: " + i);
			i++;
		}
		System.out.println(i); 
		do {
			i++;
			System.out.println("Valor de i: " + i);
		}while (i < 13);
		System.out.println(i);
	}

}
