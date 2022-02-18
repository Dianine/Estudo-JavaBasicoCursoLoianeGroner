package CursoJavaBasico.aula16_LoopsDeRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	/*Login e Senha n�o podem ser o mesmo*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean acessoValido = false;
		String login, senha; /*Declarando as Variav�is fora do Loop, REDUZ
		 ESPA�O NA MEMORIA E MELHORA A PERFORMACE*/
		
		do {
		
		System.out.print("Entre com Login: ");
		login = sc.next();
		
		System.out.print("Entre com Senha: ");
		senha = sc.next();
				
		if (!login.equalsIgnoreCase(senha)) {
			acessoValido = true;
			System.out.println("Acesso Permitido");
		} else {
			System.out.println("Acesso NEGADO, Tente Novamente");
		}

	}while (!acessoValido);

}}
