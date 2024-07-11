package main.java.list.ordenacao;

import java.util.List;

public class CadastroPessoas {
    public static void main(String[] args) {
        OrdenacaoPessoas listaPessoas = new OrdenacaoPessoas();

        listaPessoas.adicionarPessoa("Nome 1", 20, 1.56);
        listaPessoas.adicionarPessoa("Nome 2", 30, 1.80);
        listaPessoas.adicionarPessoa("Nome 3", 25, 1.70);
        listaPessoas.adicionarPessoa("Nome 4", 17, 1.60);

        System.out.println(listaPessoas.ordenarPorIdade());
        System.out.println(listaPessoas.ordenarPorAltura());
    }
}
