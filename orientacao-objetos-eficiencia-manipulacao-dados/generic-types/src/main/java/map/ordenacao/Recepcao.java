package main.java.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class Recepcao {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 17),
                "Jogar", "Mass Effect");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 18),
                "Jogar", "Diablo 4");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 7, 18),
                "Jogar", "Diablo 4");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
