public class Main {
    public static void main(String[] args) {
        Filho filho = new Filho();
        filho.setNome("João");
        filho.setComidaFavorita("Pizza");

        System.out.println("==== Informações da instância Filho ====");
        Reflexao.listarInformacoes(filho);
    }
}
