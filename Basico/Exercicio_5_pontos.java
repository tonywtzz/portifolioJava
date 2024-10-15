
// Desenvolvido por: Anthony de freitas cavalcante                    Data: 19/09/2024
import java.util.Scanner;

public class Exercicio_5_pontos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de bits: "); // Aqui o usuário irá digitar a quantidade de bits
		int bits = scanner.nextInt();

		int bytes = bits / 8; // Aqui será a quantidades de bits que o usuário forneceu dividido por 8

		int bitsrestantes = bits % 8;  
		

		
		System.out.println("Voce digitou " + bits + " bits");
		System.out.println("Esses bits equivalem a " + bytes + " bytes");
		System.out.println("E tem " + bitsrestantes + " bits restantes");

	}

}
