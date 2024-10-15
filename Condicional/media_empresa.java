import java.util.Scanner;
public class media_empresa {

	public static void main(String[] args) {
		
		   Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite o número de funcionários: ");
	        int numFuncionarios = scanner.nextInt();
	        
	        String[] nomes = new String[numFuncionarios];
	        double[] salarios = new double[numFuncionarios];
	        
	        
	       
	        for (int i = 0; i < numFuncionarios; i++) {
	            System.out.println("Digite o nome do funcionário: " );
	            nomes[i] = scanner.next();
	            
	            System.out.println("Digite o salário do funcionario: ");
	            salarios[i] = scanner.nextDouble();
	            
	           
	        }
	        
	        double somaSalarios = 0;
	        
	        for (int i = 0; i < numFuncionarios; i++) {
            somaSalarios += salarios[i];
	        }
            
            double mediaSalarial = somaSalarios / numFuncionarios;
	        
  	      
	        System.out.printf("A média salarial da empresa é: R$ %.2f%n", mediaSalarial);
	        
	       
	       	}

}
