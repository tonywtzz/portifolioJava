import java.util.Scanner; //Feito por Anthony De Freitas Cavalcante e Cássio Kalleu Santos de Souza              Data: 23/09/24       
public class Exe_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
	
		
		System.out.print("Digite um número de 1 a 1000: "); // Aqui vai ser a entrada de dados, onde o usuário irá digitar o número
		int x = scanner.nextInt(); //Aqui o pograma irá ler
		
		if (x < 1 || x > 1000) {
			System.out.println("Número inválido, Digite um número de 1 a 1000 !!"); // Aqui um if para verificar se o número passa do limite
		}else {
		
		
		for (int i = 1; i <= x; i++) {
			
			
			 if (i % 2  != 0) {
			 System.out.println("os numeros impares são: "+i);	 }
			
					
				}
			 }
	}
		
		
		
		}

		
		
		
		



	


