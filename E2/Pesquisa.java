public class Pesquisa extends Oportunidade {
    private double valorBolsa;

    public Pesquisa(String titulo, int vagas, Professor responsavel,
                    double valorBolsa) {
        super(titulo, vagas, responsavel);
        this.valorBolsa = valorBolsa;
    }

    public double getValorBolsa() {
        return valorBolsa;
    }

    @Override
    public int cargaHorariaSemanal() {
        return 20;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Pesquisa, Valor da bolsa: R$ "
                + String.format("%.2f", valorBolsa);
    }
}