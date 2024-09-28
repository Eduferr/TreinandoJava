import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Exercicio {

	public static void main(String[] args) throws IOException, EmailException {

		Path arquivo = Paths.get("C:/Users/Desk_Ferr/FileJAVA/alunos.txt");

		// Le o arquivo e coloca as informações na lista
		List<String> lista = Files.readAllLines(arquivo);

		ListaAlunos listaAlunos = new ListaAlunos();

		// para imprimir por linha
		for (int i = 0; i < lista.size(); i++) {
			String nome = lista.get(i);

			Aluno aluno = new Aluno();
			aluno.nome = nome;

			listaAlunos.adicionar(aluno);
		}

		listaAlunos.ordenar();

		String mensagem = "Os alunos são: \n"; // Lembrando que o código "\n" é para indicar que a linha encerrou e a

		for (int i = 0; i < listaAlunos.tamanho(); i++) {
			Aluno aluno = listaAlunos.obter(i);
			mensagem += (i + 1) + ". " + aluno.nome + "\n";

		}

		enviarEmail("Eduardofgsantos@gmail.com", "Lista de alunos", mensagem);
		System.out.println("Envio finalizado!");

		// Salvando a lista ordenada em um arquivo .txt
		ArrayList<String> linhas = new ArrayList<String>(); // próxima parte da String será impressa na linha posterior.
		linhas.add(mensagem);
		Path arquivoOrdenado = Paths.get("C:/Users/Desk_Ferr/FileJAVA/alunos_Ordenados2.txt");
		Files.write(arquivoOrdenado, linhas);

		System.out.println("Um novo arquivo ordenado foi gerado");
	}

	static void enviarEmail(String destinatarioEmail, String tituloEmail, String conteudoEmail) throws EmailException {
		Email email = new SimpleEmail();

		email.setHostName("smtp.gmail.com"); // Acesso ao servidor
		email.setSmtpPort(587); // numero da porta de acesso
		email.setAuthenticator(new DefaultAuthenticator("eduferr2803@gmail.com", "zqojkxnbljyddlhm")); // Acesso
		email.setSSLOnConnect(true); // Certificado de segurança
		email.setFrom("eduferr2803@gmail.com"); // email que estará enviando
		email.setSubject(tituloEmail);
		email.setMsg(conteudoEmail);
		email.addTo(destinatarioEmail);

		email.send();

	}

}
