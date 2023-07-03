
package Main;


public class DVD extends Midia {
    private int nFaixas;

    public DVD() {
    }

    public DVD(int c, double p, String n, int f) {
        super(c, p, n);
        nFaixas = f;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "\nNúmero de Faixas: " + nFaixas;
    }

    public void setFaixas(int f) {
        nFaixas = f;
    }

    @Override
    public void inserirDados() {
        // Implementação para inserir dados da classe DVD
    }
}