import com.messenger.ServicoMensagemInstantanea;
import com.messenger.facebook.FacebookMessenger;
import com.messenger.msn.MSNMessenger;
import com.messenger.telegram.Telegram;

public class PCdoPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        /*
        * NÃO SE SABE QUAL APP
        * MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
        * */

        String appEscolhindo = "tlg";

        if(appEscolhindo.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhindo.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhindo.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}