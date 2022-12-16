package apps;
public class MSNMensseger  extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        validarConexaoComInternet();
       System.out.println("Msn Enviando Mensagem");
    }

    @Override
    public void receberMensagem() {
        validarConexaoComInternet();
        System.out.println("Msn Recebendo Mensagem");
    }
   

}
