
package Main;


public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia() {
    }

    public Midia(int c, double p, String n) {
        codigo = c;
        preco = p;
        nome = n;
    }

    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        return "Código: " + codigo + "\nPreço: " + preco + "\nNome: " + nome;
    }

    public void printDados() {
        System.out.println("Tipo: " + getTipo());
        System.out.println(getDetalhes());
    }

    public void inserirDados() {
        // Implementação para inserir dados da classe Midia
    }
}
