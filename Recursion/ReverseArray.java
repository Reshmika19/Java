package Recursion;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        reverse(arr,0,n-1);
        for(int i : arr){
            System.out.print(i +" ");
        }
    }
    static void reverse(int[] arr ,int l , int r){
        if(l>=r){
            return;
        }
        swap(arr , l , r);
        reverse(arr , l+1 , r-1);
    }
    static void swap(int[] arr , int l , int r){
        int temp;
        temp = arr[l];
        arr[l] = arr[r];
        arr[r]= temp;
    }
}
