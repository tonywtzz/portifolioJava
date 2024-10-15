import java.util.Scanner;
public class Exercicio_E {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o seu número: ");
		int numerofuncionario = scanner.nextInt();
		
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		double horas = scanner.nextDouble();
		
		System.out.print("Digite o valor que recebe por hora: ");
		double valorporhora = scanner.nextDouble();
		

		double salario = horas * valorporhora;
		
		System.out.println("Numero de funcionário: "+ numerofuncionario);
		System.out.println("Salario: "+ salario);
		
		
		
		

	}

}
