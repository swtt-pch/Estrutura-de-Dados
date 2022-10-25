import exception.LimiteExtrapoladoException;

import java.util.Scanner;

public class ExemploThrow {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try{
            System.out.println("Digite a nota1");
            Double nota1 = leitor.nextDouble();
            if (nota1 < 0 || nota1 >10){
                throw new LimiteExtrapoladoException("Valor da nota1 errado");
            }
            System.out.println("Digite a nota2");
            Double nota2 = leitor.nextDouble();
            if (nota2 < 0 || nota2 >10){
                throw new LimiteExtrapoladoException("Valor da nota1 errado");
            }
        } catch (LimiteExtrapoladoException e) {
            System.out.println(e + " - " + e.getDatahora());
        }
    }
}
