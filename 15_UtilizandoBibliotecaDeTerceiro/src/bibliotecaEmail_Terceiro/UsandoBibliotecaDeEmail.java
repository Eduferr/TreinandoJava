package bibliotecaEmail_Terceiro;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		//Para funcionar o envio é necessário importar a biblioteca java activation.jar
		EmailClass.enviarEmail("Uso de biblioteca", "Se chegar é porque funcionou", "eduardofgsantos@gmail.com");

		System.out.println("Email enviado com sucesso");

	}

}
