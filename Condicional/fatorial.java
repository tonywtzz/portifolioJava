import java.util.Scanner;
public class fatorial {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número inteiro maior que zero: ");
	        int n = scanner.nextInt();

	        if (n <= 0) {
	            System.out.println("O número deve ser maior que zero.");
	        } else {
	            int fatorial = 1;

	            
	            for (int i = 1; i <= n; i++) {
	                fatorial *= i;
	            }

	            System.out.println("O fatorial de " + n + " é: " + fatorial);
	        }

	}

}
