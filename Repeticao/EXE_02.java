import java.util.Scanner;
public class EXE_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
   
		System.out.print("digite um valor inteiro: ");
		int n = scanner.nextInt();
		
		int dentro = 0;
		int fora = 0;
		
		for(int i =0; i < n; i++) {
			System.out.print("digite um valor b: ");
			int b = scanner.nextInt();
		
			if (b >= 10 && b <= 20) {
				dentro++;
			}
		
			else {
				fora++;
			}
		}
		
		System.out.println(dentro + " dentro");
		System.out.println(fora + " fora");
	}
}

