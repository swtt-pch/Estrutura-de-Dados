public abstract class Jogador implements Premiavel{
    protected String nome;
    protected String codigo;
    protected int nroJogos;

    public Jogador(String nome, String codigo, int nroJogos) {
        this.nome = nome;
        this.codigo = codigo;
        this.nroJogos = nroJogos;
    }

    public abstract Double getDesempenho();

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", nroJogos=" + nroJogos +
                '}';
    }
}
