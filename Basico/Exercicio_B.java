import java.util.Scanner;
public class Exercicio_B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o valor do raio do circulo: ");
		double raio = scanner.nextDouble();
		
		double pi = 3.14159;
		
		double area = pi * raio * 2;
		
		System.out.printf("A área do circulo é:  %.4f%n ", area);
		
		
		

	}

}
