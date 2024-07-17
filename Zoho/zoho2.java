package Zoho;

public class zoho2 {
    public static void main(String[] args) {
        int[] arr = {4,3,7,11,20,1};
        int n = arr.length;
        int x = 10 , y = 18;
        if(x<y){
            for(int i = 0 ; i<n ; i++){
                if(arr[i]>x && arr[i]<y){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
