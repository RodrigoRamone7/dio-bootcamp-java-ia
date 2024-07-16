package main.java.map.ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEventosMap.put(data, new Evento(nome, atracao));
    }

    public void obterProximoEvento(){
        Map<LocalDate, Evento> agendaEventosTreeMap = new TreeMap<>(agendaEventosMap);
        LocalDate dataAtual = LocalDate.now();

        for(Map.Entry<LocalDate, Evento> entry : agendaEventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento: " + entry.getValue() + "\n"
                                    + "Acontecerá na data: " + entry.getKey());
                break;
            }
        }
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> agendaEventosTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(agendaEventosTreeMap);
    }
}
