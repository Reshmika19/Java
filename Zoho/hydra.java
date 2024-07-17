package Zoho;

public class hydra {
    public static void main(String[] args) {
        String s = "hydration".toUpperCase();
        int len = s.length();
        int mid = len/2 , mid2 = mid -1 , mid3 = mid+1;
        for(int i = 0 ; i<len ; i++){
            if(i<=mid){
                mid3--;mid2++;
                for(int j = 0 ; j<len ; j++){
                    if(j==0 || j==len-1) System.out.print(s.charAt(mid2));
                    else if(j>0 && (j==len-i-1 || i==j)){
                        System.out.print(s.charAt(mid3));
                    }else{
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }else{
                mid3++;mid2--;
                for(int j = 0 ; j<len ; j++){
                    if(j==0 || j==len-1) System.out.print(s.charAt(mid2));
                    else if(j>0 && (j==len-i-1 || i==j)){
                        System.out.print(s.charAt(mid3));
                    }else{
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
    }
}
