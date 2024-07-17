package Search;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr =  {4, 2, 9, 1, 6, 5, 8, 7};
        System.out.println("Before insertion sort : ");
        for(int a : arr){
            System.out.print(a + " ");
        }
        //insertion sort
        for(int i = 1 ; i< arr.length ; i++){

            int key = arr[i];
            int j = i - 1;

            while(j >= 0 &&  arr[j] > key ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;

        }

        System.out.println();
        System.out.println("After insertion sort : ");
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
