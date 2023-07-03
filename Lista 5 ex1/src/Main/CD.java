
package Main;


public class CD extends Midia {
    private int nMusicas;

    public CD() {
    }

    public CD(int c, double p, String n, int m) {
        super(c, p, n);
        nMusicas = m;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "\nNúmero de Músicas: " + nMusicas;
    }

    public void setMusicas(int m) {
        nMusicas = m;
    }

    @Override
    public void inserirDados() {
        // Implementação para inserir dados da classe CD
    }
}
