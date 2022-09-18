import java.util.Scanner;

public class ExemploVetor {

    public static void exibeVetor(int[] vetor){
        for(int i = 0; i< vetor.length; i++){
            System.out.print("vetor["+i+"] = " + vetor[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // criação do objeto leitor
        Scanner leitor = new Scanner(System.in);
//
//        // criação do vetor
//        int[] vetor = new int[5];
//
//        // criando vetor com lista de inicializadores
//        int[] vetor2 = {100, 200, 300, 400, 500, 600,700};
//
//        // Inicializa os valores do vetor
//        for (int i = 0; i < vetor.length; i++) {
//            vetor[i] = i * 10;
//        }
//
//        // exibe os valores do vetor
//        exibeVetor(vetor);
//        exibeVetor(vetor2);
//
//        // Solicita que os usuarios digitem os valores para o vetor
//        int[] vetor3 = new int[3];
//        for (int i = 0; i < vetor3.length; i++) {
//            System.out.printf("Digite o valor de ["+i+"]:");
//            vetor3[i] = leitor.nextInt();
//        }
//        exibeVetor(vetor3);
//
//        // Solicita que os usuarios digitem os valores para o  agora String
//        String[] vetor4 = new String[3];
//        for (int i = 0; i < vetor4.length; i++) {
//            System.out.printf("Digite um texto para a posicao ["+i+"]:");
//            vetor4[i] = leitor.next();
//        }
//        for(int i = 0; i< vetor4.length; i++){
//            System.out.print("vetor["+i+"] = " + vetor4[i] + "\t");
//        }
//        System.out.println();
//        String[] semana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"};
//        int n = 0;
//        while (n<1 || n>7) {
//            System.out.println("digite um numero de 1 a 7: ");
//            n = leitor.nextInt();
//            if (n<1 || n>7) System.out.println("valor inválido");
//        }
//        System.out.println(semana[n-1]);

        int[] numero = {1,1,1,2,1,4,1,1};
        int soma = 0, pares = 0;
        for (int i = 0; i < numero.length; i++) {
            soma+= numero[i];
        }

        for (int i = 0; i < numero.length; i++) {
            if(numero[i] %2 == 0) pares++;
        }
        System.out.println(soma);
        System.out.println(pares);
    }


}
