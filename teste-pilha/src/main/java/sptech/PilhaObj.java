package sptech;

public class PilhaObj<T> {
    private T[] pilha;
    private int topo;

    public PilhaObj(int tamanho) {
        pilha = (T[]) new Object[tamanho];
        topo = -1;
    }

    public Boolean isEmpty() {
        return topo == -1;
    }

    public Boolean isFull() {
        return topo==pilha.length-1;
    }

    public void push(T info) {
        if (isFull()) throw new IllegalStateException("Lista está cheia");
        pilha[++topo] = info;
    }

    public T pop() {
        if (isEmpty()) throw new IllegalStateException("Lista está vazia");
        return pilha[topo--];
    }

    public T peek() {
        if (isEmpty()) throw new IllegalStateException("Lista está vazia");;
        return pilha[topo];
    }

    public void exibe() {
        if (isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }
        for (int i = topo; i > 0; i--) {
            System.out.println("["+ i + "] = " + pilha[topo]);
        }
    }

    public int getTopo() {
        return topo;
    }
}
