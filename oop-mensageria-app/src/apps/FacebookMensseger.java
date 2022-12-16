package apps;
public class FacebookMensseger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        validarConexaoComInternet();
        System.out.println("Facebook Enviando Mensagem");
    }

    @Override
    public void receberMensagem() {
        validarConexaoComInternet();
        System.out.println("Facebook Recebendo Mensagem");
    }
    
}
