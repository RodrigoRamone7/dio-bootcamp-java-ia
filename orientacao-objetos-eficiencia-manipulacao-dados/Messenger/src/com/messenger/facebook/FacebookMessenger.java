package com.messenger.facebook;

import com.messenger.ServicoMensagemInstantanea;

public class FacebookMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
        salvarHistoricoMensagem();
    }
}
