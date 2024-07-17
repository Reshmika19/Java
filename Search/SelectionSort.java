package Search;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 6 , 1, 2 , 5, 4, 9 , 8, 7};
        int size = arr.length;

        System.out.println("Before sorting ");
        for(int a : arr){
            System.out.print(a + " ");
        }
        //it use min value
        for(int i = 0 ; i < size ; i++){
            int minIndex = i;
            for(int j = i+1 ; j < size ; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        //it use max value
        for(int i = size-1 ; i >= 0 ; i--){
            int maxIndex = i;
            for(int j = i-1 ; j >= 0 ; j--){
                if(arr[maxIndex] < arr[j]){
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println();
        System.out.println("After sorting ");
        for(int a : arr){
            System.out.print(a + " ");
        }

    }
}
