import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Teste {

    // Testar Classe ListaEstatica
    public static void main(String[] args) {
        ListaEstaticaOrdenada lista = new ListaEstaticaOrdenada(5);
        lista.adiciona(50);
        lista.adiciona(60);
        lista.adiciona(30);
        lista.adiciona(70);
        lista.adiciona(10);
        lista.exibe();
    }
}
