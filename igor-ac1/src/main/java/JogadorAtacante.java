public class JogadorAtacante extends Jogador{
    private int golsMarcados;
    private int assistencias;

    public JogadorAtacante(String nome, String codigo, int nroJogos, int golsMarcados, int assistencias) {
        super(nome, codigo, nroJogos);
        this.golsMarcados = golsMarcados;
        this.assistencias = assistencias;
    }


    @Override
    public Double getDesempenho() {
        return (golsMarcados + assistencias) / Double.valueOf(nroJogos);
    }

    @Override
    public Double getPremio() {
        return this.getDesempenho() * 200;
    }

    @Override
    public String toString() {
        return "JogadorAtacante{" +
                "golsMarcados=" + golsMarcados +
                ", assistencias=" + assistencias +
                ", nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", nroJogos=" + nroJogos +
                '}';
    }
}
