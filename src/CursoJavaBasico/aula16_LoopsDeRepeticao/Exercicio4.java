package CursoJavaBasico.aula16_LoopsDeRepeticao;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int popA = 80000;
		int popB = 200000;
		int cont = 0;
		
		while(popA < popB) {
			popA += popA * 0.03;
			popB += popB * 0.015;
			cont++;
		}
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Quantidade de Anos: " + cont);
	}

}
