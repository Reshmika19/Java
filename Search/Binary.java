package Search;

import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {3 , 8, 2, 7 ,1 ,9, 5 ,6 ,4};
        //Arrays.sort(arr);
//        for(int a : arr){
//            System.out.println(a);
//      }
        int target = 1;
       int res = BinarySearch(arr , target);
//        int res = linearSearch(arr , target);
        if(res != -1){
            System.out.println("The element is at " + (res+1));        }
    }
    static int BinarySearch(int arr[] , int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right ) / 2;
            if(arr[mid] == target){
                System.out.println("element found");
                return mid;
            }

            else if (arr[mid] < target)
                left = mid + 1 ;
            else
                right = mid - 1;
        }
        return -1;

    }
    static int linearSearch(int arr[] , int target){
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
