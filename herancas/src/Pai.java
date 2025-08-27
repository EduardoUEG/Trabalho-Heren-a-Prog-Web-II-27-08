public class Pai extends Pessoa {
    private int quantidadeFilhos;

    public int getQuantidadeFilhos() {
        return quantidadeFilhos;
    }

    public void setQuantidadeFilhos(int quantidadeFilhos) {
        this.quantidadeFilhos = quantidadeFilhos;
    }

    @Override
    public String getTipoVoz() {
        return "Voz fina";
    }
}
