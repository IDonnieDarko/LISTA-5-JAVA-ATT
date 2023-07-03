
package main;


abstract class Veiculo {
    protected String nome;
    protected double preco;

    public Veiculo(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void printDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
    }
}