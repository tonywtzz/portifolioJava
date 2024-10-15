import java.util.Scanner;
public class temperatura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = celsius * 1.8 + 32 ; 
        double kelvin = celsius + 273.15;
        double reaumur = celsius * 0.8; 
        double rankine = celsius * 1.8 + 32 + 459.67;
        
        System.out.println("a temperatura em celsius é: " + celsius);
        System.out.println(" a temperatura em fahrenheit é: " + fahrenheit);
        System.out.println(" a temperatura em kelvi é: " + kelvin);
        System.out.println(" a temperatura em reaumur é: " + reaumur);
        System.out.println(" a temperatura em rankine é: " + rankine);
		

	}

}
