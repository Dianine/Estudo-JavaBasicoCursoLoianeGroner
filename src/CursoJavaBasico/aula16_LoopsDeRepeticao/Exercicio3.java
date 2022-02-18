package CursoJavaBasico.aula16_LoopsDeRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		boolean infoValida = false;
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		
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
		
		boolean infoIdade = false;
				
		do {
			
			System.out.print("\nEntre com Idade: ");
			idade = sc.nextInt();
			System.out.println();
			
			if (idade >= 0 && idade <=150) {
				infoIdade = true;
			}else {
				System.out.print("A idade deve ser entre 0 e 150 anos. \nTente novamente!");
			}
						
		} while (!infoIdade);
		
		
		boolean infoSalario = false;
		
		do {
			
			System.out.print("\nEntre com Salario: ");
			salario = sc.nextDouble();
			System.out.println();
			
			if (salario > 0) {
				infoSalario = true;
			}else {
				System.out.print("O salario deve ser Maior que R$: 0. \nTente novamente!");
			}
						
		} while (!infoSalario);
		
		boolean infoSexo = false;
		
		do {
			
			System.out.print("\nEntre com M-Masculino ou F-Feminino: ");
			sexo = sc.next();
			System.out.println();
			
			if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				infoSexo = true;
			}else {
				System.out.print("Letra Inválida. \nTente novamente!");
			}
						
		} while (!infoSexo);
		
		boolean infoEstadoCivil = false;
		
		do {
			
			System.out.print("\nEntre com Estado Civil: ");
			estadoCivil = sc.next();
			System.out.println();
			
			if (estadoCivil.equalsIgnoreCase("s") || 
				estadoCivil.equalsIgnoreCase("c") || 
				estadoCivil.equalsIgnoreCase("v") || 
				estadoCivil.equalsIgnoreCase("d")){
				infoEstadoCivil = true;
			}else {
				System.out.print("Letra Inválida, Entre com S - Solteiro | C - Casado | V - Viuva | D - Divorciada. \nTente novamente!");
			}
						
		} while (!infoEstadoCivil);
		
		System.out.println("________Dados Coletados________");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario :R$ " + salario);
		System.out.println("Genero: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
	}
	
	
}


