package CursoJavaBasico.aula16_LoopsDeRepeticao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int maior = Integer.MIN_VALUE;
		
		
		for (int i =0; i <5; i++) {
			System.out.println("Entre com Valor" + (i+1) + ": ");
			num = sc.nextInt();
			
			if (num > maior) {
				maior = num;
				System.out.println("o número maior mudou: " + maior);
			}
						
		}
		System.out.println("O maior número digitado foi: " + maior);
	}

}
