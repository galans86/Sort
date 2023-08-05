
public class Main {
    public static void main(String[] args) {
        int[] array = {3,2,1,5,6,8,0,9,4,7};
        int[] sortArray = HeapSort.Sort(array);
       for(int i =0 ; i < array.length; i++) {
           System.out.printf("%d ",sortArray[i] );
       }
    }
}