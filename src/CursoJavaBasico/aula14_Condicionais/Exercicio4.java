package CursoJavaBasico.aula14_Condicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com uma Letra: ");
		String letra= sc.nextLine();
		
		if(letra.equalsIgnoreCase("a") || 
				letra.equalsIgnoreCase("e") || 
				letra.equalsIgnoreCase("i") || 
				letra.equalsIgnoreCase("o") ||
				letra.equalsIgnoreCase("u")) {
			System.out.println("A letra digitada é uma VOGAL");
		}else {
			System.out.println("A letra digitada é uma CONSOANTE");
		}

	}

}
