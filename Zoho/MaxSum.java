package Zoho;

public class MaxSum {
    public static void main(String[] args) {
        int[] arr = {0,5,6,0,9,0,10,4};
        int max = 0;
        for(int i = 0 ; i< arr.length-1; i++){
            int j = i + 1;
            int sum = arr[i] + arr[j];
            if(sum > max)
                max = sum;
        }
        System.out.println(max);
    }
}
