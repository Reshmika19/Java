package Arrays;

public class RotateD {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println("\nRotate array");
        int d = 4 ;
        int n = arr.length;
        reverse(arr , 0 , d-1);
        reverse(arr , d , n-1);
        reverse(arr , 0 , n-1);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void reverse(int arr[] , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
