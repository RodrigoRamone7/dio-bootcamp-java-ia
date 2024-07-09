package main.java.list.operacoesBasicas;

public class Mercado {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Caneta", 1.50, 3);
        carrinhoDeCompras.adicionarItem("Borracha", 0.50, 1);
        carrinhoDeCompras.adicionarItem("Caderno", 20, 1);

        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total do carrinho R$ " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Borracha");
        carrinhoDeCompras.exibirItens();
    }
}
