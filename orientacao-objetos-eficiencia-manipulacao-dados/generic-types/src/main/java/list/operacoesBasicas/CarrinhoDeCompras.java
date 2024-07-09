package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoCompras;

    public CarrinhoDeCompras(){
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        for (Item item : carrinhoCompras) {
            if(item.getNome().equalsIgnoreCase(nome)){
                carrinhoCompras.remove(item);
                break;
            }
        }
    }

    public double calcularValorTotal(){
        double resultado = 0;
        for(Item item : carrinhoCompras){
            resultado += item.getPreco() * item.getQuantidade();
        }

        return resultado;
    }

    public void exibirItens(){
        System.out.println(carrinhoCompras);
    }
}
