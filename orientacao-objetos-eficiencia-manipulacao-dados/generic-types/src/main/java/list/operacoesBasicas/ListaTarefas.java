package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas(){
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa tarefa : listaTarefas){
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
            }
        }
        listaTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefas);
    }
}
