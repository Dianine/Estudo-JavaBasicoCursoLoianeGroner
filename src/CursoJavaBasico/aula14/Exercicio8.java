package CursoJavaBasico.aula14;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Entre com preço da Banana: ");
		double preco1 = sc.nextDouble();
		
		System.out.print("Entre com preço da Uva: ");
		double preco2 = sc.nextDouble();
		
		System.out.print("Entre com preço da Jaca: ");
		double preco3 = sc.nextDouble();
		
		if (preco1 < preco2 && preco1 < preco3) {
			System.out.println("Compre a Banana, Pois é o MENOR PREÇO!! ");
		}else if (preco2 < preco1 && preco2 < preco3) {
			System.out.println("Compre a Uva, Pois é o MENOR PREÇO!!");
		}else if (preco3 < preco1 && preco3 < preco2) {
			System.out.println("Compre a Java, Pois é o MENOR PREÇO!!");
		}

	}

}

