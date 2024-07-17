package Arrays;

public class dec {
    public static void main(String[] args) {
        double n = 6.5;
        String res = mixed(n);
        System.out.println(res);
    }
    static String mixed(double num){
        int wholep = (int) num;
        double fractionpart = num - wholep;
        if(fractionpart==0){
            return String.valueOf(wholep);}
        int nume = 1;
        while(fractionpart != Math.floor(fractionpart)){
            nume *= 10;
            fractionpart *= 10;
        }
        int deno = (int) fractionpart;
        int gcd = fgcd(nume , deno);
        nume /= gcd;
        deno /= gcd;

        return wholep + " " +deno + " / " + nume;
    }
    static int fgcd(int a , int b){
        if(b==0) return a;
        return fgcd(b , a%b);
    }
}
