import java.util.Scanner;
public class Exercicio_D {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o código da peça 1: ");
		int codigopeça1 = scanner.nextInt();
		
		System.out.print("Digite a quantidade de peças 1: ");
		int quantidadepeça1 = scanner.nextInt();
		
		System.out.print("Digite o valor unitário da peça 1: ");
		double valorunitariopeça1 = scanner.nextDouble();
		
		System.out.print("Digite o código da peça 2: ");
		int codigopeça2 = scanner.nextInt();
		
		System.out.print("Digite a quantidade de peças 2: ");
		int quantidadepeça2 = scanner.nextInt();
		
		System.out.print("Digite o valor unitário da peça 2: ");
		double valorunitariopeça2 = scanner.nextDouble();
		
		double valortotal = (quantidadepeça1 * valorunitariopeça1) + (quantidadepeça2 * valorunitariopeça2);
		
		System.out.print("O valor total a pagar é: " + valortotal);
		
		
		
		


		

	}

}
