package main.java.set.pesquisa;

public class AppLigacoes {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Rodrigo", 77644041);
        agendaContatos.adicionarContato("Rodrigo Casa", 77644041);
        agendaContatos.adicionarContato("Rodrigo Trabalho", 77644041);
        agendaContatos.adicionarContato("Rodrigo Curso", 77644041);
        agendaContatos.adicionarContato("Rodrigo Ramone", 77644041);
        agendaContatos.adicionarContato("Cristiano Peres", 77644041);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.atualizarNumeroContato("Rodrigo", 95667782));

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Rodrigo"));
    }
}
