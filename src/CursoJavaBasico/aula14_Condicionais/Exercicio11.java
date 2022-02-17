package CursoJavaBasico.aula14_Condicionais;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com salario: ");
		double salario= sc.nextDouble();
		
		int perc = 0;
		
		if(salario <=280) {
			perc = 20;
		}else if (salario >280 && salario <=700) {
			perc = 15;
		}else if (salario > 700 & salario <=1500) {
			perc = 10;
		}else {
			perc = 5;
		}
		double aumento = (salario/100)*perc;
		double salarioAjust = salario + aumento;
		
		System.out.println("Salario Bruto: " + salario);
		System.out.println("Percentual " + perc + "%");
		System.out.println("Aumento: " + aumento);
		System.out.println("Salario Ajustado: " + salarioAjust);
		
		

	}

}
