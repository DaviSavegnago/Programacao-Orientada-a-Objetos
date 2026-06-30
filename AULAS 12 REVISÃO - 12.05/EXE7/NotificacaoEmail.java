package ppkg;
import java.util.Arrays;

public class NotificacaoEmail extends Notificacao {
	
	public void enviar(String mensagem) {
		System.out.println("Enviando notificação de email..."+mensagem);
	}
	
	public void enviar(String mensagem, String destinatario) {
        System.out.println("Enviando e-mail para [" + destinatario + "]: " + mensagem);
    }
	
    public void enviar(String mensagem, String... destinatarios) {
        System.out.println("Enviando e-mail para os destinatários " + Arrays.toString(destinatarios) + ": " + mensagem);
    }
}
