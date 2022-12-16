package apps;
public class TelegramMensseger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        validarConexaoComInternet();
        System.out.println("Telegram Enviando Mensagem");
    }

    @Override
    public void receberMensagem() {
         validarConexaoComInternet();
        System.out.println("Telegram Recebendo Mensagem");
    }
    
}
