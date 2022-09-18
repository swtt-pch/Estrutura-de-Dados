import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
        ex4();
    }

    static void ex1(){
        int[] numeros = new int[7];
        for (int i =0; i < 7; i++){
            numeros[i] = scan.nextInt();
        }
        for (int i = numeros.length - 1; i >= 0; i--){
            System.out.println(numeros[i]);
        }
    }

    static  void ex2(){
        int [] numeros = new int[10];
        double media = 0.0, soma = 0.0;
        for (int i = 0; i < 10; i++) {
            numeros[i] = scan.nextInt();
            soma += numeros[i];
        }
    }

    static void ex3(){
        String[] nomes = new String[10];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("digite:");
            nomes[i] = scan.nextLine();
        }
        System.out.println("Digite um nome: ");
        String nome = scan.nextLine();
        for (int i = 0; i < nomes.length; i++){
            if (nomes[i].equals(nome)){
                System.out.println("Nome encontrado no índice "+ i);
                return;
            }
        }
        System.out.println("Nome não encontrado");
    }

    static void ex4(){
        int[] numeros = new int[10];
        for (int i =0; i < numeros.length; i++){
            numeros[i] = scan.nextInt();
        }
        System.out.println("Digite um numero: ");
        int numero = scan.nextInt();
        int count = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero) count ++;
        }
        System.out.println("o número "+numero+" ocorre "+count+" vezes");
    }
}
