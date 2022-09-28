import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AppArquivoCsv {
    public static void main(String[] args) {

        ListaObj<Produto> lista = new ListaObj<>(10);
        lista.adiciona(new Produto(100, "Mouse sem fio", 80.0, 50));
        lista.adiciona(new Produto(101, "Mouse com fio", 50.0, 60));
        lista.adiciona(new Produto(102, "Mouse hibrido", 130.0, 30));
        //lista.exibe();
        gravaArquivosCsv(lista, "produtos");
        leExibeArquivoCsv("produtos");
    }

    public static void gravaArquivosCsv (ListaObj<Produto> lista, String nomeArq){
        FileWriter arq = null; // objeto que representa o arquivo de gravação
        Formatter saida = null; // objeto usado para gravar o arquivo
        Boolean deuRuim = false;
        if (!nomeArq.contains(".csv")) nomeArq += ".csv";

        // bloco para abrir o arquivo
        try{
            arq = new FileWriter(nomeArq); //cria ou abre o arquivo
            saida = new Formatter(arq);
        } catch (IOException error){
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }

        // Bloco para gravar o arquivo
        try {
            for (int i = 0; i < lista.getTamanho(); i++) {
                Produto p = lista.getElemento(i);
                saida.format(
                        "%d;%s;%.2f;%d\n",
                        p.getId(),
                        p.getNome(),
                        p.getValorUnitario(),
                        p.getQuantidadeEstoque()
                );
            }
        }
        catch (FormatterClosedException error){
            System.out.println("Erro ao gravar o arquivo");
            deuRuim = true;
        }
        finally {
            saida.close();
            try{
                arq.close();
            } catch (IOException error){
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }

        }
        if (deuRuim) System.exit(1);
    }

    public static void leExibeArquivoCsv (String nomeArq) {
        FileReader arq = null; // objeto que representa o arquivo que vai ser lido
        Scanner entrada = null; // objeto usado para ler o arquivo
        Boolean deuRuim = false;
        if (!nomeArq.contains(".csv")) nomeArq += ".csv";

        // Bloco para abrir o arquivo
        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        } catch (FileNotFoundException erro){
            System.out.println("Arquivo não encontrado");
            System.exit(1);
        }
        try{
            System.out.printf("%-6s %-40s %10s %7s\n" , "código", "nome", "valor", "estoque");
            while (entrada.hasNext()){
                int id = entrada.nextInt();
                String nome = entrada.next();
                Double valor = entrada.nextDouble();
                Integer estoque = entrada.nextInt();
                System.out.printf("%06d %-40s %10.2f %7d\n", id, nome, valor, estoque);
            }
        }
        catch (NoSuchElementException erro) {
            System.out.println("Não existem elementos no documento");
            System.out.println(erro);
            deuRuim = true;
        }
        catch (IllegalStateException erro) {
            System.out.println("Erro na leitura do arquivo");
            deuRuim = true;
        }
        finally {
            entrada.close();
            try{
                arq.close();
            } catch (IOException error){
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
        }
        if (deuRuim) System.exit(1);
    }
}
