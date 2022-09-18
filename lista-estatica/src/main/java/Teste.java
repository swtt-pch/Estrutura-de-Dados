import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Teste {

    // Testar Classe ListaEstatica
    public static void main(String[] args) {
        ListaEstatica listaEstatica = new ListaEstatica(3);
        listaEstatica.adiciona(10);
        listaEstatica.adiciona(20);
        listaEstatica.adiciona(30);
        assertFalse(listaEstatica.removePeloIndice(3));
        assertFalse(listaEstatica.removePeloIndice(-3));
    }
}
