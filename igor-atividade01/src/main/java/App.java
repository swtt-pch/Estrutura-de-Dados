import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ListaObj<Jogo> jogos = new ListaObj<>(5);
        boolean sair = false;
        while (!sair){
            System.out.println("\nEscolha um número: \n" +
                    "1. Adicionar um jogo a lista ➕\n" +
                    "2. Exibir lista de jogos 🗒️\n" +
                    "3. Fim do programa 💀");
            int decisao = leitor.nextInt();
            while(decisao < 1 || decisao > 3) {
                System.out.println("digite uma das opções:");
                decisao = leitor.nextInt();
            }
            switch (decisao){
                case 1: {
                    System.out.println("digite o nome do jogo");
                    String nome = leitor.next();
                    System.out.println("digite o preço do jogo");
                    double preco = leitor.nextDouble();
                    System.out.println("quantos jogadores podem jogar simultaneamente?");
                    int qtdJogadores = leitor.nextInt();
                    System.out.println("é um jogo que pode ser jogado online? [true] para sim, [false] para não");
                    boolean isOnline = leitor.nextBoolean();
                    int id = jogos.nroElem + 1;
                    jogos.adiciona(new Jogo(id, nome, preco, qtdJogadores, isOnline));
                    System.out.printf("Jogo %s cadastrado \n", nome);
                    break;
                }
                case 2: {
                    if (jogos.getTamanho() == 0) {
                        System.out.println("\nNenhum jogo adicionado");
                        break;
                    }
                    System.out.printf("\n%5s | %-15s | %10s | %10s | %6s \n", "id", "nome", "jogadores", "preço", "online");
                    for (int i = 0; i < jogos.getTamanho(); i++) {
                        System.out.printf("%05d | %-15s | %10d | %10.2f | %6s \n",
                                jogos.getElemento(i).getId(),
                                jogos.getElemento(i).getNome(),
                                jogos.getElemento(i).getQtdJogadores(),
                                jogos.getElemento(i).getPreco(),
                                jogos.getElemento(i).isOnline() ? "sim" : "não");
                    }
                    System.out.println("");
                    break;
                }
                case 3: {
                    sair = true;
                    break;
                }
            }
        }
    }
}
