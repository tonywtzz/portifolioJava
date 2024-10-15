import java.util.Scanner;
public class EXE_matricula {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sim para matriculado e nao para matriculado: ");
		String input = scanner.nextLine();
		
		if (input.equalsIgnoreCase("sim")) {
			System.out.println("Matriculado");
		}
		else if (input.equals("nao")) {
            System.out.println(" Nao matriculado");}
		else {
			System.out.println(" Erro, entrada invalida ");
		}
	scanner.close();
	}
	

}
