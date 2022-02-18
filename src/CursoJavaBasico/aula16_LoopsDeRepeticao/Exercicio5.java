package CursoJavaBasico.aula16_LoopsDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
				
		double popA, popB, taxaA, taxaB;
		boolean pop = false;
		
		do {
			
			System.out.println("Entre com a quantidade de Habitantes da População A: ");
			popA=sc.nextDouble();
			
			if (popA > 0) {
				pop = true;
			}else {
				System.out.println("O número deve ser Maior que 0.");
			}
						
			} while(!pop);
		
			pop= false;
			do {
			
			System.out.println("Entre com a quantidade de Habitantes da População B: ");
			popB=sc.nextDouble();
			
			if (popA > 0) {
				pop = true;
			}else {
				System.out.println("O número deve ser Maior que 0.");
			}
									
			} while(!pop);
			
			pop= false;
			do {
			
			System.out.println("Entre com o Percentual de Crescimento da População A: ");
			taxaA=sc.nextDouble();
			
			if (taxaA > 0) {
				pop = true;
			}else {
				System.out.println("O percentual deve ser Maior que 0.");
			}
									
			} while(!pop);
			
			pop= false;
			do {
			
			System.out.println("Entre com o Percentual de Crescimento da População B: ");
			taxaB=sc.nextDouble();
			
			if (taxaB > 0) {
				pop = true;
			}else {
				System.out.println("O percentual deve ser Maior que 0.");
			}
									
			} while(!pop);
			
			int cont= 0;
			while(popA < popB) {
				popA += (popA/100) * taxaA;
				popB += (popB/100) * taxaB;
				cont++;
			}
			System.out.println("População A: " + popA);
			System.out.println("População B: " + popB);
			System.out.println("Quantidade de Anos: " + cont);

	}

}
