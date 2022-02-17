package CursoJavaBasico.aula14_Condicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Entre con Nota 1: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Entre con Nota 2: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if(media == 10) {
			System.out.println("Aprovado com Média Máxima");
		}else if(media >= 7 ) {
			System.out.println("Aprovado");
		}else if (media <7) {
			System.out.println("Reprovado");
		}
		System.out.println("Média: "+ media);
	}

}
