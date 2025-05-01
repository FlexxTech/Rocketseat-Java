package Exercicios.SistemadeCadastrodoProduto;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void removerProduto(String nomeProduto){
        produtos.removeIf(prod -> prod.getNome().equalsIgnoreCase(nomeProduto));
    }

    public void exibirProdutos(){
        for (Produto p : produtos){
            System.out.println(p);
            System.out.println("-----------------");
        }
    }

    public Produto buscarProduto(String nomeProduto){
        for (Produto prod : produtos){
            if(prod.getNome().equalsIgnoreCase(nomeProduto)){
                return prod;
            }
        }
        return null;
    }
}
