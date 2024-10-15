import java.util.Scanner;
public class media_aritmetica_pares {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		 int soma = 0;
	        int contador = 0;

	        
	        for (int i = 14; i < 73; i += 2) { 
	            soma += i;
	            contador++;
	        }

	        
	        double media = (double) soma / contador;

	        System.out.println("A média aritmética dos números pares entre 13 e 73 é: " + media);

	}

}
