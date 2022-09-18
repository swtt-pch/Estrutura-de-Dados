public class Patrocinador implements Premiavel{
    private String nome;
    private String nomeEquipe;
    private int vitorias;
    private double valorInvestido;

    public Patrocinador(String nome, String nomeEquipe, int vitorias, double valorInvestido) {
        this.nome = nome;
        this.nomeEquipe = nomeEquipe;
        this.vitorias = vitorias;
        this.valorInvestido = valorInvestido;
    }

    @Override
    public Double getPremio() {
        return valorInvestido * ((vitorias * 2.0) / 100);
    }

    @Override
    public String toString() {
        return "Patrocinador{" +
                "nome='" + nome + '\'' +
                ", nomeEquipe='" + nomeEquipe + '\'' +
                ", vitorias=" + vitorias +
                ", valorInvestido=" + valorInvestido +
                '}';
    }
}
