package CursoJavaBasico.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com Idade: ");
		int idade = sc.nextInt();
		
		if (idade >= 18) {
			System.out.println("Maior de Idade!");
		}else {
			System.out.println("Menor de Idade!");
		}
		System.out.println("-----------------------------");
		System.out.println();
		//barato <= 10
		//10 < valor < 15 - pedir desconto
		//15 <= valor 17 - pesquisar mais
		//>= 17 - muito caro
		
		System.out.print("Entre com valor do Produto: ");
		double valor= sc.nextDouble();
		
		
		if (valor <= 10) {
			System.out.println("esta barato, pode comprar!");
		} else if(valor > 10 && valor < 15 ) {
			System.out.println("Você pode pedir um desconto");
		}else if(valor >= 15 && valor < 17 ) {
			System.out.println("Pesquise mais");
		}else {
			System.out.println("Está muito caro");
		}
		
		
		
		
		
	}

}
