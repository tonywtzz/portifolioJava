import java.util.Scanner;
public class senha_2002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		  for (int i = 1; i < 4; i++) {
			  System.out.println("Digite a senha: ");
			  int senha = scanner.nextInt();

			  if (senha == 2002) {
				  System.out.print("Acesso permitido");
				  
			  }
				  
			  if (senha != 2002) {
				  System.out.println("Acesso negado, voce ja tentou " + i + " vez, com 3 erros não consegue o acesso ");
			  }
			 
		  }
	

	}

}
