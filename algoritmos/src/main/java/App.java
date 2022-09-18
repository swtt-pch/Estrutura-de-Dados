public class App {
    public static void main(String[] args) {
        int[] arr = {4,3,6,2,6,9,7,2,2,5,7,8};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println(" ");
        //selectionSort(arr);
        //selectionSortOptimized(arr);
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void selectionSort(int[] arr){
        int comparacao = 0, troca = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                comparacao++;
                if (arr[i]> arr[j]) {
                    troca++;
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        System.out.println("comparações: "+comparacao+"; trocas: "+troca);
    }

    public static void selectionSortOptimized(int[] arr){
        int comparacao = 0, troca = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                comparacao++;
                if (arr[index] > arr[j]) index = j;
            }
            troca++;
            int aux = arr[i];
            arr[i] = arr[index];
            arr[index] = aux;
        }
        System.out.println("comparações: "+comparacao+"; trocas: "+troca);
    }

    public static void bubbleSort(int[] arr){
        int comparacao = 0, troca = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                comparacao++;
                if (arr[j-1] > arr[j]){
                    troca++;
                    int aux = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = aux;
                }
            }
        }
        System.out.println("comparações: "+comparacao+"; trocas: "+troca);
    }
}
