package CursoJavaBasico.aula16_LoopsDeRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		boolean infoValida = false;
		String nome;
		int idade;
		
		do {
			
			System.out.print("\nEntre com o nome: ");
			nome = sc.next();
			System.out.println();
			
			if (nome.length() >= 3) {
				infoValida = true;
			}else {
				System.out.print("O nome deve ter no minimo 3 caracteres. \nTente novamente! ");
			}
						
		} while (!infoValida);
		
		boolean infovalida = false;
		
		do {
			
			System.out.print("\nEntre com Idade: ");
			idade = sc.nextInt();
			System.out.println();
			
			if (idade > 0 && idade <=150) {
				infoValida = true;
			}else {
				System.out.print("A idade deve ser entre 0 e 150 anos. \nTente novamente!");
			}
						
		} while (!infoValida);
	}

}
