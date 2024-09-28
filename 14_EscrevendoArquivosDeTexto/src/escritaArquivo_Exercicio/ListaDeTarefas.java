package escritaArquivo_Exercicio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {

	// Crie um programa que vai receber, através do console, uma lista de atividades
	// que vai ajudar o usuário a planejar suas tarefas para o dia seguinte.
	// Depois que o usuário informar, uma a uma, suas tarefas, as mesmas serão
	// salvas em um arquivo de texto - cada tarefa vai ocupar uma linha desse
	// arquivo.
	// Para receber cada tarefa do usuário, use o laço while. Enquanto o usuário não
	// digitar um "x" no console, continue pedindo que ele informe as atividades.

	public static void main(String[] args) throws IOException {
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
		Path arquivo = Paths.get("C:/Users/Desk_Ferr/FileJAVA/minhasTarefas.txt");
		Files.write(arquivo, linhas);

		sc.close();
		System.out.println("[INFO] - Finalizado");
	}

}
