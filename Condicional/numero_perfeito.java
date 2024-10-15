import java.util.Scanner;
public class numero_perfeito {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
	
	        
	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();
	        int somaDivisores = 0;

	        
	        for (int i = 1; i < numero; i++) {
	            if (numero % i == 0) {
	                somaDivisores += i;
	            }
	        }

	       
	        if (somaDivisores == numero) {
	            System.out.println(numero + " é um número perfeito.");
	        } else {
	            System.out.println(numero + " não é um número perfeito.");
	        }

	}

}
