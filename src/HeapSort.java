public class HeapSort {
    public static int[] Sort(int[] array){
        int length = array.length;
        //самый большой элемент окажется на нулевой позиции
        for ( int i = length / 2 - 1; i >= 0; i--){
            heapify(array, length, i);
        }

        //разворот
        for(int i = length - 1; i >= 0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            //оставшаяся часть
            heapify(array,i,0);
        }
       return array;
    }

    private static void heapify(int[] array, int heapSize, int rootIndex){
        int largest = rootIndex;
        int leftChild = rootIndex * 2 + 1;
        int rightChild = rootIndex * 2 + 2;

        if (leftChild < heapSize && array[leftChild] > array[largest]) {
            largest = leftChild;
        }
        if(rightChild < heapSize && array[rightChild] > array[largest]){
            largest = rightChild;
        }

        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            // преобразуем затронутое поддерево
            heapify(array,heapSize,largest);
        }
    }
}
