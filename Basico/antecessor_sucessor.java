import java.util.Scanner;
public class antecessor_sucessor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		
		int antecessor = numero - 1;
		System.out.println("Antecessor é: " + antecessor);
		
		int sucessor = numero + 1;
		System.out.println("Sucessor é: " + sucessor);
		

	}

}