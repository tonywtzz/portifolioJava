import java.util.Scanner;
public class EXE_03 {
//feito por:  anthony e cassio
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" digite um valor:");
		int num1 = scanner.nextInt();
		
		for(int i = 0; i < num1; i++) {
			System.out.print("digite um numero: ");
			double num2 = scanner.nextDouble();
			
			
		
		if(num2 == 0) {
			System.out.println("divisao impossivel");
		}else {
			double resultado = num1/num2;
			System.out.printf(" Resultado: %.2f%n", +resultado);
		}
		}

	}

}

