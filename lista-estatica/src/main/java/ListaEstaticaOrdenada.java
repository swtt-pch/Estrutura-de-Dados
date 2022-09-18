public class ListaEstaticaOrdenada extends ListaEstatica{

    public ListaEstaticaOrdenada(int tamanho) {
        super(tamanho);
    }

    @Override
    public void adiciona(int elemento){
        if (nroElem == vetor.length) {
            throw new IllegalStateException();
        }

        if (nroElem == 0){
            vetor[0] = elemento;
            nroElem++;
            return;
        }
        
        if (elemento< vetor[0]){
            adicionarNoInicio(elemento);
            return;
        }
        
        vetor[nroElem] = elemento;
        
        if (elemento > vetor[nroElem-1]){
            nroElem++;
            return;
        }
        
        nroElem++;
        selectionSortOptimized(vetor);
    }

    public void selectionSortOptimized(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]) index = j;
            }
            int aux = arr[i];
            arr[i] = arr[index];
            arr[index] = aux;
        }
    }
}
