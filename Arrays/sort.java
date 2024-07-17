package Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,7,6};
        //int num = 3;
//        for(int i = 0 ; i<arr.length-1 ; i++){
//            if(arr[i]<num && arr[i+1]>num){
//                System.out.println("It will be placed here between "+arr[i] +" and " + arr[i+1]);
//                break;
//            }
//        }
        int i = 0 ;
        int j = arr.length -1;
        while(i<j){
            int max = findMax(arr);
            int min = findMax2(arr);
            swap(arr , i , j);
            i++; j--;
        }
    }
    static int findMax(int[] arr){
        int max = 0;
        for(int i = 0 ; i< arr.length ; i++){
            if( arr[i] > max) max = arr[i];
        }
        return max;
    }
    static int findMax2(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i< arr.length ; i++){
            if( arr[i] < min) min = arr[i];
        }
        return min;
    }
    static void swap(int arr[] , int i , int j ){

    }
}
