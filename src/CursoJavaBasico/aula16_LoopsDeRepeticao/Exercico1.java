package CursoJavaBasico.aula16_LoopsDeRepeticao;

import java.util.Scanner;

public class Exercico1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
		
			System.out.print("Entre com uma nota de Zero a Dez: ");
			int nota = sc.nextInt();
			System.out.println();
			
			if (nota >= 0 && nota <=10) {
				notaValida = true;
			System.out.println("Você Digitou a Nota: " + nota);
			}else {
			System.out.println("Nota inválida, Digite Novamente.");
			
			}

		}while(!notaValida);
	}
}
