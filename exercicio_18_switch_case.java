import java.util.Scanner;
import java.util.Locale;

public class exercicio_18_switch_case {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o operador desejado: ");
		char operador = leitor.next().charAt(0);
		System.out.println("Digite dois números para calcular");
		double num1 = leitor.nextDouble();
		double num2 = leitor.nextDouble();
		double resultado = 0;
		switch (operador) {
		case ('+'):
			resultado = num1 + num2;
		break;
		
		case ('-'):
			resultado = num1 - num2;
		break;
		
		case ('*'):
			resultado = num1 * num2;
		break;
		
		case ('/'):
			resultado = num1 / num2;
		break;
		
		default:
			System.out.println("Operação inválida");
		}
		System.out.printf("%.2f%n",resultado);
		
		
		leitor.close();
		
	}
	
}