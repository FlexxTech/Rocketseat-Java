package Exercicios.SistemadeCadastrodoProduto;

public class SistemaProduto {
    public static void main(String[] args) {
        Produto prod1 = new Produto("Mac Book",1573.99,20);
        Produto prod2 = new Produto("Iphone 16",1590.99,10);
        Produto prod3 = new Produto("Ipad",2125.50,5);
        Estoque estoque = new Estoque();

        prod1.adicionarEstoque(10);
        prod1.aplicarDesconto(10);
        System.out.println("Desconto de 10% aplicado!");
        prod1.exibirInformacoes();

        estoque.adicionarProduto(prod1);
        estoque.adicionarProduto(prod2);
        estoque.adicionarProduto(prod3);
        estoque.exibirProdutos();
        estoque.removerProduto("Mac Book");
        System.out.println("Após remoção do estoque");
        estoque.exibirProdutos();

        Produto encontrado = estoque.buscarProduto("Ipad");
        if(encontrado != null){
            System.out.println("Produtos encontrado!");
            encontrado.exibirInformacoes();
        }else{
            System.out.println("Produto não encontrado, busque novamente!");
        }
    }
}
