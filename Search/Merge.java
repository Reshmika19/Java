package Search;

public class Merge {

    static void mergesort(int[] arr , int l , int r) {

        if(l<r){

            int mid = (l+r)/2;

            mergesort(arr , l , mid);

            mergesort(arr , mid+1 , r);

            SortMerge(arr , l ,mid , r);
        }

    }

    static void SortMerge(int[]  arr, int l , int mid , int r) {

        int n1 = mid - l +1 ;
        int n2 = r - mid;

        int[] larr = new int[n1];
        int[] rarr = new int[n2];

        for(int x = 0 ; x<n1 ; x++){
            larr[x] = arr[l+x];
        }

        for(int x = 0 ; x<n2 ;x++){
            rarr[x] = arr[mid+x+1]; //it starts from mid+1
        }

        int i = 0 , j = 0 , k = l; //actual arr starts from left side , so k = l

        while(i<n1 && j<n2){

            if(larr[i]<=rarr[j]){
                arr[k] = larr[i];
                i++;
            }
            else{
                arr[k] = rarr[j];
                j++;
            }

            k++;

        }
        while(i<n1){
            arr[k] = larr[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k] = rarr[j];
            j++;
            k++;
        }


    }

    public static void main(String[] args) {
        int[] arr =  {4, 2, 9, 1, 6, 5, 8, 7};
        System.out.println("Before Merge sort : ");
        for(int a : arr){
            System.out.print(a + " ");
        }

        mergesort(arr , 0 , arr.length-1);

        System.out.println("\nAfter Merge sort : ");
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
