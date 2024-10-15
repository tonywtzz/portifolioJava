
public class Exemplo_Verdadeiro_falso {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = false;
		boolean condicao3 = true;
		
		
		boolean resultadoE = condicao1 && condicao2 ;
		System.out.println("Resultado do operador E (&&): " + resultadoE);
		
		boolean resultadoOU = condicao1 || condicao2;
		System.out.println("Resultado do operador OU (||): " + resultadoOU);
		
		boolean resultadoNAO = !condicao3;
		System.out.println("Resultado do operdaor NÃO (!): " + resultadoNAO);
		
		boolean resultadoCombinado = (condicao1 && condicao2) || (condicao2 && condicao3);
		System.out.println("Resultado da combinação de operadores: " + resultadoCombinado);

	}
	}