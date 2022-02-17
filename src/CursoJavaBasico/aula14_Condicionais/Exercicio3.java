package CursoJavaBasico.aula14_Condicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
				
		System.out.println("Entre com F ou M: ");
		String letra = sc.next();
		
		//Comparação de String sempre usa o Equals ou EqualsIgnoreCase//
		
		if (letra.equalsIgnoreCase("f")) {
			System.out.println("Genero: F-Feminino");	
		}else if (letra.equalsIgnoreCase("m")){
			System.out.println("Genero: M-Masculino");
		}else {
			System.out.println("Sexo Inválido");
		}

		
	}

}


