import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFunc(Funcionario f){
        funcionarios.add(f);
    }

    public void exibeTodos(){
        for (Funcionario funcionario:
             funcionarios) {
            System.out.println(funcionario);
        }
    }

    public void exibeTotalSalario(){
        double total = 0;

        for (Funcionario funcionario :
                funcionarios) {
            total += funcionario.calcSalario();
        }

        System.out.println(total);
    }

    public void exibeHorista() {
        for (Funcionario funcionario :
                funcionarios) {
            if (funcionario instanceof Horista)
                System.out.println(funcionario);
        }
    }

    public void buscaFunc(String cpf) {
        for (Funcionario funcionario :
                funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                System.out.println(funcionario);
            }
        }
    }

}
