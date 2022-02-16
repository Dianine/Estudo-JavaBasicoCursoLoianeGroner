package CursoJavaBasico.aula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner (System.in);
		
		System.out.print("Insira a Nota1: ");
		double nota1 = sc.nextDouble();
		System.out.print("Insira a Nota2: ");
		double nota2 = sc.nextDouble();
		System.out.print("Insira a Nota3: ");
		double nota3 = sc.nextDouble();
		System.out.print("Insira a Nota4: ");
		double nota4 = sc.nextDouble();
		
		double soma= (nota1 + nota2 + nota3 + nota4)/4;
		System.out.printf("Média : "  + soma);
		

	}

}
