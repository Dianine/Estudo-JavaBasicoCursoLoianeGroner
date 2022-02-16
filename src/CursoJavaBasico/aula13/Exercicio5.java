package CursoJavaBasico.aula13;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		
		System.out.print("Valor em Metros: ");
		double metros = sc.nextDouble();
		
		double convert = metros * 100;
		System.out.println(metros + " Metro(s) equivale a: " + convert + " Centimentros");
		
		
		
	}

}
