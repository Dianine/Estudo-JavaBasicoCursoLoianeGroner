package CursoJavaBasico.aula16_LoopsDeRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean acessoValido = false;
		
		do {
		
		System.out.print("Entre com Login: ");
		String login = sc.next();
		
		System.out.print("Entre com Senha: ");
		String senha = sc.next();
				
		if (!login.equalsIgnoreCase(senha)) {
			acessoValido = true;
			System.out.println("Acesso Permitido");
		} else {
			System.out.println("Acesso NEGADO, Tente Novamente");
		}

	}while (!acessoValido);

}}
