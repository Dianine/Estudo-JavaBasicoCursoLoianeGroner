package CursoJavaBasico.aula13;

import java.util.Scanner;

public class Exercio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quanto custa em (R$) sua hora trabalhada ?  ");
		double valor= sc.nextDouble();
		System.out.print("Quantas hora voc� trabalhou esse m�s ? ");
		double horasTrabalhadas= sc.nextDouble();
		
		
		double salarioBruto = valor * horasTrabalhadas;
		System.out.println("Salrio Bruto � : R$ " + salarioBruto);
		
		
	}

}
