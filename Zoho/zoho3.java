package Zoho;

public class zoho3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int n = arr.length;
        int gap = 3;
        int a = 0;
        int sum = 0;
        while(a!=3){
            for(int i = a ; i<n ; i = i+gap){
                sum += arr[i];
            }
            System.out.println(sum);
            sum = 0;
            a++;
        }
    }
}
