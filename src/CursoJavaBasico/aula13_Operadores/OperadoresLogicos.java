package CursoJavaBasico.aula13_Operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		int x1 = 1;
		int x2 = 2;
		
		boolean resultado1 = (x1 ==1) && (x2 ==2);
		System.out.println("Resultado1: " + resultado1);
		
		boolean resultado2 = (x1 ==1) || (x2 ==2);
		System.out.println("Resultado2: "+ resultado2);
		
		System.out.println("------------------");
		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println("verdadeiro && falso: " + (verdadeiro && falso));
		System.out.println("verdadeiro || falso: " + (verdadeiro || falso));
		System.out.println("verdadeiro ^ falso: " + (verdadeiro ^ falso));
		System.out.println("!verdadeiro && falso: " + (!verdadeiro && falso));
		
		

	}

}
