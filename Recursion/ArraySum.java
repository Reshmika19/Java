package Recursion;

public class ArraySum {
    public static int Asum(int arr[] , int sum , int i){

        if(i >= arr.length )
            return sum;
        return Asum(arr,sum+arr[i] , i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Array sum is " + Asum(arr,0,0));
    }
}
