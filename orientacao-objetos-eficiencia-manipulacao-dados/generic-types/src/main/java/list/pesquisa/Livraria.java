package main.java.list.pesquisa;

public class Livraria {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1995);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 1", 1992);
        catalogoLivros.adicionarLivro("Livro 7", "Autor 6", 1983);
        catalogoLivros.adicionarLivro("Livro 8", "Autor 6", 1960);

        catalogoLivros.listaDeLivros();

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2023));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
