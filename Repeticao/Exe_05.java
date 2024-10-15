import java.util.Scanner;
public class Exe_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite um número inteiro positivo: ");
		int n = scanner.nextInt();
		
		if (n > 0) {
		
			for (int i = 1; i <= n; i++) {
				int quadrado = i * i;
				int cubo = i * i * i;
				
				System.out.println( i + " " + quadrado + " " + cubo);
			}
			
	}	else {
				System.out.print("Digite um número positivo!!");
			}
			
						
			}
	
	}


