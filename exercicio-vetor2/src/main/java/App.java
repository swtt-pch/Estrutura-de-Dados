import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //ex05();
        ex06();
    }

    static void ex05(){
        int[] rendimentos = new int[5];
        String[] carros = new String[5];
        int maxRendimento = 0;
        int posicao = 0;

        for (int i = 0; i < carros.length; i++) {
            System.out.println("carro: ");
            carros[i] = scan.next();
            System.out.println("rendimento: ");
            rendimentos[i] = scan.nextInt();

            if (rendimentos[i] > maxRendimento){
                posicao = i;
                maxRendimento = rendimentos[i];
            }
        }

        System.out.println("O carro com maior rendimento é: " + carros[posicao]);
    }

    static void ex06(){
        int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("dia");
        int dia = scan.nextInt();
        System.out.println("mês");
        int mes = scan.nextInt();
        int accDia = dia;
        for (int i = 1; i < mes; i++) {
            accDia += dias[i - 1];
        }
        System.out.println("O dia "+dia+"/"+mes+" corresponde ao dia "+accDia+" do ano.");
    }
}
