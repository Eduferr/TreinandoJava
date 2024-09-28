package leituraArquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivo {

	public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get("C:/Users/Desk_Ferr/FileJAVA/minhasTarefas.txt");

		//Le o arquivo e coloca as informações na lista
		List<String> linhas= Files.readAllLines(arquivo);
		// para imprimir por linha
		for (int i=0; i<linhas.size(); i++){
			String nome = linhas.get(i);
			System.out.println(nome);
		}
		
		System.out.println("-------------");
		//imprimindo a lista em array
		System.out.println(linhas);
	}

}
