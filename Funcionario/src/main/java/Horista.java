public class Horista extends Funcionario{

    private Integer qtdHoras;
    private Double vlrHora;

    public Horista(String cpf, String nome, Integer qtdHoras, Double vlrHora) {
        super(cpf, nome);
        this.qtdHoras = qtdHoras;
        this.vlrHora = vlrHora;
    }

    @Override
    Double calcSalario() {
        return qtdHoras * vlrHora;
    }

    @Override
    public String toString() {
        return "Horista{" +
                "qtdHoras=" + qtdHoras +
                ", vlrHora=" + vlrHora +
                ", salario=" +calcSalario()+
                "} " + super.toString();
    }
}
