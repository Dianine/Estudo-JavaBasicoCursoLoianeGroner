package CursoJavaBasico.aula14;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Entre com pre�o da Banana: ");
		double preco1 = sc.nextDouble();
		
		System.out.print("Entre com pre�o da Uva: ");
		double preco2 = sc.nextDouble();
		
		System.out.print("Entre com pre�o da Jaca: ");
		double preco3 = sc.nextDouble();
		
		if (preco1 < preco2 && preco1 < preco3) {
			System.out.println("Compre a Banana, Pois � o MENOR PRE�O!! ");
		}else if (preco2 < preco1 && preco2 < preco3) {
			System.out.println("Compre a Uva, Pois � o MENOR PRE�O!!");
		}else if (preco3 < preco1 && preco3 < preco2) {
			System.out.println("Compre a Java, Pois � o MENOR PRE�O!!");
		}

	}

}

