package Recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(PowerV(2,8));
    }
    public static long PowerV(int x , int y){
        if(y==0)
            return 1;
        if(y%2==0){
            long res = PowerV( x , y/2);
            return res*res;
        }
        else {
            return PowerV(x , y-1)*x;
        }
    }
}
