import java.util.Scanner;
public class maior_menor {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[10];
	        int maior, menor;

	        
	        System.out.println("Digite 10 números inteiros:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        
	        maior = numeros[0];
	        menor = numeros[0];
	       
	        
	        for (int i = 1; i < 10; i++) {
	            if (numeros[i] > maior) {
	                maior = numeros[i];
	            }
	            if (numeros[i] < menor) {
	                menor = numeros[i];
	            }
	        }

	         
	        System.out.println("O maior número digitado foi: " + maior);
	        System.out.println("O menor número digitado foi: " + menor);

	}

}
