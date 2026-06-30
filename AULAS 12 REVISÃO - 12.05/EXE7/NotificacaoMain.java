package ppkg;

public class NotificacaoMain {

	public static void main(String[] args) {
		
		 NotificacaoEmail email = new NotificacaoEmail();
	     NotificacaoApp app = new NotificacaoApp();

	     System.out.println("--- Demonstração de Notificações --- \n");

	     email.enviar("Seu relatório semanal está pronto.");
	     app.enviar("Você tem uma nova mensagem de texto.");
	       
	     System.out.println("\n--- Demonstração de Sobrecarga (E-mail) --- \n");
	     
	     email.enviar("Confirmação de cadastro");
	     email.enviar("Alerta de manutenção no servidor");
	    
		
	}

}
