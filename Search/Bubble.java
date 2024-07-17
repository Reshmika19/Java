package Search;

public class Bubble {
    public static void main(String[] args) {
        int arr[] = { 3, 8 , 1, 2 , 5, 4, 9 , 8, 7};
        int size = arr.length;

        System.out.println("Before sorting ");
        for(int a : arr){
            System.out.print(a + " ");
        }
        for(int i = 0 ; i< size; i++){

            for(int j = 0 ; j< size-i-1 ; j++){
               if(arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }

            }

        }

        System.out.println();
        System.out.println("After sorting ");
        for(int a : arr){
            System.out.print(a + " ");
        }

    }
}
