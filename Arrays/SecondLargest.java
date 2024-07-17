package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2 , 12 , 54 , 123, 542 ,90 , 234 , 643};
        int m1 , m2 ,m3;
        if(arr[0] > arr[1] && arr[0] > arr[2]) {
            m1 = arr[0];
            if(arr[1] > arr[2]) {
                m2 = arr[1];
                m3 = arr[2];
            }
            else{
                m3 = arr[2];
                m2 = arr[1];
            }
        }
        else if(arr[1] > arr[0] && arr[1] > arr[2]) {
            m1 = arr[1];
            if(arr[0] > arr[2]) {
                m2 = arr[0];
                m3 = arr[1];
            }
            else{
                m3 = arr[1];
                m2 = arr[0];
            }
        }
        else {
            m1 = arr[2];
            if (arr[1] > arr[0]) {
                m2 = arr[1];
                m3 = arr[0];
            } else {
                m3 = arr[1];
                m2 = arr[0];
            }
        }

        for(int i = 3 ; i< arr.length ; i++){
            if(arr[i] > m1){
                m3 = m2;
                m2 = m1;
                m1 = arr[i];
            }
            else if(arr[i] > m2){
                m3 = m2;
                m2 = arr[i];
            }
            else if(arr[i] > m3)
                m3 = arr[i];
        }
        System.out.println("The third largest is " + m3);
    }
}

