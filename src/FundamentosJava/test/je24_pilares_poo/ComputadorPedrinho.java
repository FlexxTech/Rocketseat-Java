package FundamentosJava.test.je24_pilares_poo;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEcolhido = "msn";

        if (appEcolhido.equals("msn")){
            smi =  new MSNMessenger();
        } else if (appEcolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        } else if (appEcolhido.equals("tlg")) {
            smi = new TelegramMessenger();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
