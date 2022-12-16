package apps;
public abstract class ServicoMensagemInstantanea {
   
   
        public abstract void enviarMensagem();

        public abstract void receberMensagem();

        protected void validarConexaoComInternet(){
            System.out.println("Validando conexão");
        }
    


}
