import java.util.Scanner;
public class Exe_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = scanner.nextInt();
		
		System.out.println("Os divisores de " + n + " :");
		
		for(int i = 1; i < n; i++) {
			
			if (n % i == 0) {
				System.out.println(i);
				
			}
		}

	}

}
