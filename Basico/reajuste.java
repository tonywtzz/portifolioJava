import java.util.Scanner;
public class reajuste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite um valor: ");
		double valor = scanner.nextDouble();
		
		double reajuste = ( valor * 1 ) / 100;
		
		double total = reajuste + valor ;
		
		System.out.print("Novo valor: " + total);
		

	}

}
