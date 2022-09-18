public class Vendedor extends Funcionario{

    private Double valorVendas;
    private Double taxa;

    public Vendedor(String cpf, String nome, Double valorVendas, Double taxa) {
        super(cpf, nome);
        this.valorVendas = valorVendas;
        this.taxa = taxa;
    }

    @Override
    Double calcSalario() {
        return valorVendas * taxa;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "valorVendas=" + valorVendas +
                ", taxa=" + taxa +
                ", salario=" +calcSalario() +
                "} " + super.toString();
    }
}
