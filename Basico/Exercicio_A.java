import java.util.Scanner;
public class Exercicio_A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o primeiro número: " );
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite o segundo número: " );
		int numero2 = scanner.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.print("A soma do número " + numero1 + " com o número " + numero2 + " é: " + soma);
		
		
	

	}

}
