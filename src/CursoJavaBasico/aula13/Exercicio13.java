package CursoJavaBasico.aula13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor por Hora: ");
		double valorHora = sc.nextDouble();
		System.out.println("Quantas Horas Trabalhadas no Mês: ");
		double qntHoras = sc.nextDouble();
		
		
		double salarioBruto = valorHora * qntHoras;
		double descIR = salarioBruto * 0.11;
		double descINSS= salarioBruto * 0.08;
		double descSind = salarioBruto * 0.05;
		double salarioLiquido = salarioBruto - descINSS - descIR - descSind;
		System.out.println("Salario Bruto: R$ " + salarioBruto);
		System.out.println("Imposto de Renda: R$ " + descIR);
		System.out.println("INSS: R$ " + descINSS);
		System.out.println("Sindicato: R$ " + descSind);
		System.out.println();
		System.out.println("Salario Liquido: R$ " + salarioLiquido);

	}

}
