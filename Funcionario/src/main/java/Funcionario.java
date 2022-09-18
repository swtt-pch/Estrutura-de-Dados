public abstract class Funcionario {
    private String cpf;
    private String nome;

    Funcionario (String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    abstract Double calcSalario();

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    protected String getCpf() {
        return cpf;
    }

    protected String getNome() {
        return nome;
    }
}
