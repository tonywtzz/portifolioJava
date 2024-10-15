import java.util.Scanner;
public class Exe_ansiedade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		String[] perguntas = {
				
			"Voce se sente com dificuldade de concentração ? ",
			"Voce se sente cansado facilmente ? ",
			"Tem dificuldade em adormecer ou permanecer a dormir ? ",
			"Voce se preocupa muito com o futuro ? ",
			"Tem dificulodade em relaxar ? ",
			"Sentiu - se tão preocupado que foi dificil ficar parado ? ",
			"Sentiu - se facilmente irritável ou chateado ? ",
			"Sentiu medo como se algo muito ruim fosse acontecer ? ",
			"Voce se proucupa com a opinião dos outros ? ",
			"Voce está com dificuldade em lembrar de detalhes ? "
				
	
		};
		
		String[] respostas = new String [10];
		
		int pontuacao = 0;
		
	
		
		for (int i = 0; i < perguntas.length; i++) {
			System.out.println(perguntas[i] + "Responda as perguntas com sim ou não : ");
			respostas[i] = scanner.nextLine();
		
			if (respostas[i].equals("sim")) {
				pontuacao++;
			}
		}
		
		System.out.println("Resultado do teste: ");
		if (pontuacao >= 8 ) {
			System.out.println("Alta probabilidade de ansiedade ");
		}
		
		else if (pontuacao >= 5 ) {
			System.out.println("Sinais moderados de ansiedade ");
		}
		else {
			System.out.println("Baixa probabilidade de ansiedade ");
		}
		
		}
				

	}


