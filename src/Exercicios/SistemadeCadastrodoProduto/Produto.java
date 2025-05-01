package Exercicios.SistemadeCadastrodoProduto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirInformacoes(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor em estoque: "+ calcularValorTotalEmEstoque());
    }

    public double calcularValorTotalEmEstoque(){
        return preco * quantidade;
    }

    public void adicionarEstoque(int quantidade){
        this.quantidade += quantidade;
        System.out.println(quantidade + " adicionadas com sucesso!");
    }
    public void removerEstoque(int removerProduto){
        if (removerProduto <= this.quantidade){
            this.quantidade-=removerProduto;
            System.out.println(removerProduto+" removidos com sucesso!");
        }else{
            System.out.println("Estoque insuficiente!!");
        }
    }

    public void aplicarDesconto(double percentual){
        double valorDesconto = this.preco * (percentual / 100);
        this.preco -= valorDesconto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
