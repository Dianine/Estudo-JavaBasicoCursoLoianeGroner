package CursoJavaBasico.aula14;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Entra com as Latra M-Matutino | V-Vespertino | N-Noturno: ");
		String letra = sc.next();
		
		switch (letra){
		case "m": 
		case "M": System.out.println("Matutino");break;
		case "v": 
		case "V": System.out.println("Matutino");break;
		case "n": 
		case "N": System.out.println("Matutino");break;
		default: System.out.println("Valor Inválido");
				}

	}

}
