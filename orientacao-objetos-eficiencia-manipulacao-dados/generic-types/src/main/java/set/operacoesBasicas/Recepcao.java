package main.java.set.operacoesBasicas;

public class Recepcao {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados na lista.");

        conjuntoConvidados.adicionarConvidado("rodrigo", 328);
        conjuntoConvidados.adicionarConvidado("rodrigo", 328);
        conjuntoConvidados.adicionarConvidado("rodrigo", 328);
        conjuntoConvidados.adicionarConvidado("rodrigo", 328);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados na lista.");
    }
}
