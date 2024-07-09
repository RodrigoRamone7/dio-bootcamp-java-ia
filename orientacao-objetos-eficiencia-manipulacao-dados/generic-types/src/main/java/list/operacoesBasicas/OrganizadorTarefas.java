package main.java.list.operacoesBasicas;

public class OrganizadorTarefas {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Lavar louça");
        listaTarefas.adicionarTarefa("Lavar louça 1");
        listaTarefas.adicionarTarefa("Lavar louça 1");
        listaTarefas.adicionarTarefa("Lavar louça 2");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Lavar louça 1");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();

    }
}
