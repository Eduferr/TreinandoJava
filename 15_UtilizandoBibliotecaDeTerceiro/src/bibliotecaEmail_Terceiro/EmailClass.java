package bibliotecaEmail_Terceiro;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailClass {

	static void enviarEmail(String assunto, String mensagem, String enviarPara) throws EmailException {

		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com"); // Acesso ao servidor
		email.setSmtpPort(587); // numero da porta de acesso
		email.setAuthenticator(new DefaultAuthenticator("eduferr2803@gmail.com", "zqojkxnbljyddlhm")); // dados de
																										// acesso
		email.setSSLOnConnect(true); // Certificado de segurança
		email.setFrom("eduferr2803@gmail.com"); // email que estará enviando

		email.setSubject(assunto); // Título do email
		email.setMsg(mensagem); // corpo do email
		email.addTo(enviarPara); // email destinatário
		email.send(); // enviando email
	}

}
