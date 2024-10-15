import java.util.Scanner;
public class exe_pontoflutuante {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println(" Digite o  valor A: ");
        double A = scanner.nextDouble();	
        
        System.out.println(" Digite o  valor B: ");
        double B = scanner.nextDouble();
        
        System.out.println(" Digite o  valor C: ");
        double C = scanner.nextDouble();
        
        System.out.printf(" A area do triangolo retangulo é: %.3f%n ", + (A * C)/2 );
        
        double pi = 3.14159;
        System.out.printf(" A area do circulo de raio C é: %.3f%n ", + pi * (C * C) );
        
        System.out.printf(" A area do trapezio é: %.3f%n ",+ (A + B ) * C/2 );
            
        System.out.printf(" A area do quadrado que tem o lado B é: %.3f%n  ", + B * B );
        
        System.out.printf("A area do retangulo  que tem lados A e B é: %.3f%n ", + A * B );
        
        
	}

}
