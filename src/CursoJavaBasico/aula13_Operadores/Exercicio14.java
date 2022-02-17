package CursoJavaBasico.aula13_Operadores;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com tamanho arquivo: ");
		double tamArquivo = sc.nextDouble();
		
		System.out.print("Entre com Velocidade da Internet: ");
		double velInternet = sc.nextDouble();
		
		double tempo = tamArquivo / velInternet;
		System.out.println("Tempo de download é: " + tempo );
		

	}

}
