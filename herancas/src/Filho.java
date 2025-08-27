public class Filho extends Pessoa {
    private String comidaFavorita;

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }

    @Override
    public String getTipoVoz() {
        return "Voz aguda";
    }
}
