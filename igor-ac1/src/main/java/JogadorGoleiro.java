public class JogadorGoleiro extends Jogador{
    private int golsSofrido;
    private int penaltiesDefendidos;

    public JogadorGoleiro(String nome, String codigo, int nroJogos, int golsSofrido, int penaltiesDefendidos) {
        super(nome, codigo, nroJogos);
        this.golsSofrido = golsSofrido;
        this.penaltiesDefendidos = penaltiesDefendidos;
    }


    @Override
    public Double getDesempenho() {
        return (penaltiesDefendidos - golsSofrido) / Double.valueOf(nroJogos);
    }

    @Override
    public Double getPremio() {
        return this.getDesempenho() * 300;
    }

    @Override
    public String toString() {
        return "JogadorGoleiro{" +
                "golsSofrido=" + golsSofrido +
                ", penaltiesDefendidos=" + penaltiesDefendidos +
                ", nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", nroJogos=" + nroJogos +
                '}';
    }
}
