package Arrays;

public class Move0 {
    public static void main(String[] args) {
        int[] arr = { 1, 0 , 2, 3,2,0,0,4,2,1};
        int j = -1;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        for(int i = j+1 ; i< arr.length ; i++){
            if(arr[i]!=0){
                swap(arr, i, j);
                j++;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
