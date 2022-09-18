import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] turma1 = new String[10];
        String[] turma2 = new String[10];
        int idx1 = 0, idx2 = 0;
        String nome, turma;
        for (int i = 0; i< 10; i++){
            System.out.println("Digite o nome do aluno");
            nome = leitor.next();
            do{
                System.out.println("Digite a turma: t1 ou t2");
                turma = leitor.next();
            } while (!turma.equalsIgnoreCase("t1") &&
                    !turma.equalsIgnoreCase("t2"));

            if (turma.equalsIgnoreCase("t1")){
                turma1[idx1++] = nome;
            } else {
                turma2[idx2++] = nome;
            }
        }

        if (idx1 == 0){
            System.out.println("Não há alunos na turma 1");
        } else {
            System.out.println("há "+idx1+" alunos na turma 1, sendo eles: ");
            for (int i = 0; i < idx1; i++) {
                System.out.println(turma1[i]);
            }
        }

        if (idx2 == 0){
            System.out.println("Não há alunos na turma 2");
        } else {
            System.out.println("há "+idx2+" alunos na turma 2, sendo eles: ");
            for (int i = 0; i < idx2; i++) {
                System.out.println(turma2[i]);
            }
        }
    }
}
