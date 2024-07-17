package Recursion;

public class Sum {
    public static void main(String[] args) {
        int n = 5;
        //parametrized recursion
//        sumv(n,0);
//    }
//    static void sumv(int i , int sum){
//        if(i<1){
//            System.out.println(sum);
//            return;
//        }
//        sumv(i-1,sum+i);
//
//    }

        //functional recursion
        int sumv = add(n);
        System.out.println(sumv);

    }
    static int add(int n){
        if(n==0){
          return 0;
        }
        return n + add(n-1); //recursion
    }
}
