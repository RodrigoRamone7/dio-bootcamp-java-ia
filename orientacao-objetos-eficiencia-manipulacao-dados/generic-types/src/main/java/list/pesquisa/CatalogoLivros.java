package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogoLivros;

    public CatalogoLivros() {
        this.catalogoLivros = new ArrayList<>();
    }

    public void adicionarLivro(String nome, String autor, int anoPublicacao){
        catalogoLivros.add(new Livro(nome, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!catalogoLivros.isEmpty()){
            for (Livro livro : catalogoLivros){
                if(livro.getAutor().equalsIgnoreCase(autor));
                livrosPorAutor.add(livro);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if(!catalogoLivros.isEmpty()){
            for(Livro livro : catalogoLivros){
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalo.add(livro);
                }
            }
        }

        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!catalogoLivros.isEmpty()){
            for (Livro livro : catalogoLivros){
                if(livro.getTitulo().equalsIgnoreCase(titulo));
                livroPorTitulo = livro;
                break;
            }
        }

        return livroPorTitulo;
    }
}
