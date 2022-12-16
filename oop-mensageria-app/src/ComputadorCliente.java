import apps.FacebookMensseger;
import apps.MSNMensseger;
import apps.ServicoMensagemInstantanea;
import apps.TelegramMensseger;

public class ComputadorCliente {
    public static void main(String[] args) {
        ServicoMensagemInstantanea sms = null;
        String appEscolhido = "msn";

        if (appEscolhido.equals("msn")) {
            sms = new MSNMensseger();
        } else if (appEscolhido.equals("tlg")) {
            sms = new TelegramMensseger();
        } else {
            sms = new FacebookMensseger();
        }
        sms.enviarMensagem();
        sms.receberMensagem();

    }
}

// Private --> Encapsular é somente esconder, mas os métodos ainda estão na
// aplicação. Com o encapsulamento, temos uma melhor divisão de
// responsabilidades, deixando muito dos procedimentos a cargo da própria
// aplicação.
