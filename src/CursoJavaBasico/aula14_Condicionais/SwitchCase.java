package CursoJavaBasico.aula14_Condicionais;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System. in);
		
		System.out.println("Entre com um dia da semana (1 -7): ");
		int diaSemana= sc.nextInt();
		
		if(diaSemana == 1 ) {
			System.out.println("Domingo");
		}else if (diaSemana == 2) {
			System.out.println("Segunda");
		}else if (diaSemana == 3) {
			System.out.println("Terça");
		}else if (diaSemana == 4) {
			System.out.println("Quarta");
		}else if (diaSemana == 5) {
			System.out.println("Quinta");
		}else if (diaSemana == 6) {
			System.out.println("Sexta");
		}else if (diaSemana == 7) {
			System.out.println("Sábado");
		}else {
			System.out.println("Você não digitou um dia Válido");
		}
		
		System.out.println();
		System.out.println("----------SWITCH-CASE----------");
		
		switch(diaSemana) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda-feira");break;
		case 3: System.out.println("Terça-feira");break;
		case 4: System.out.println("Quarta-feira");break;
		case 5: System.out.println("Quinta-feira");break;
		case 6: System.out.println("Sexta-feira");break;
		case 7: System.out.println("Sábado");break;
		default: System.out.println("Você não digitou um dia Válido");
		}
		System.out.println();
		System.out.println("----------SWITCH-CASE sem BREAK----------");
		switch(diaSemana) {
		
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("Dia Útil");break;
		case 1: 
		case 7: System.out.println("fim de Semana");break;
		default: System.out.println("Você não digitou um dia Válido");
		
	}

}}
