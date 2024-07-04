package com.messenger;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }
}
