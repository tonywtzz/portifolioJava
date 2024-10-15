import java.util.Scanner;
public class Calc_IMC {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = input.nextLine();
		
		System.out.print("Digite seu sexo (H / M ): ");
		char sexo = input.next().charAt(0);
		
		System.out.print("Digite sua idade: " );
		int idade = input.nextInt();
		
		System.out.print("Digite seu peso (kg): ");
		double peso = input.nextDouble();
		
		System.out.print("Digite sua altura: ");
		double altura = input.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("Nome: "+ nome);
		System.out.println("sexo: "+ sexo);
		System.out.println("idade: "+ idade);
		System.out.println("peso: "+ peso);
		System.out.println("altura: "+ altura);
		
		if  (imc < 18.5) {
			System.out.print("Abaixo do peso!");
		}
		else if (imc >= 18.6 && imc <= 24.9 ) {
			System.out.print("Peso ideal (parabéns) ");
		}
		else if (imc >= 25.0 &&  imc <= 29.9 ) {
			System.out.print("Levemente acima do peso");
		}
		else if (imc >= 30.0 && imc <= 34.9) {
			System.out.print("Obesidade grau 1 ");
		}
		else if (imc >= 35.0 && imc <= 39.9) {
			System.out.print("Obesidade grau 2 ( severa )");
		}
		else if (imc > 40) {
			System.out.print("Obesidade grau 3 ( Mórbida )");
		}
		
		System.out.print("Seu IMC é: "+ imc);
		
		

		
		
	

	}

}
