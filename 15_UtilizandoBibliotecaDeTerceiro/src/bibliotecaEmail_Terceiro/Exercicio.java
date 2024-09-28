package bibliotecaEmail_Terceiro;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class Exercicio {

	public static void main(String[] args) throws EmailException{
		Scanner sc = new Scanner(System.in);

		ArrayList<String> linhas = new ArrayList<>();

		int i = 0;
		while (true) { // Deixei o true como condição do laço, pois, o que vai pará-lo é o fato do
						// usuário digitar o "x" no console.
			System.out.print("Tarefa " + i + ": ");
			String tarefa = sc.nextLine();

			if ("x".equals(tarefa)) {
				break; // Essa é a única maneira de parar esse laço.
			}
			linhas.add(tarefa);
			i++;
		}
		String tarefas = "";

		for (int iteracao = 0; iteracao < linhas.size(); iteracao++) {
			tarefas += iteracao + " - " + linhas.get(iteracao) + "\n";
		}
		System.out.print("Digite seu e-mail: ");
		String para = sc.next();

		EmailClass.enviarEmail("Sua lista de tarefas2", tarefas, para);

		System.out.println("[INFO] - Finalizado");
		sc.close();

	}

}
