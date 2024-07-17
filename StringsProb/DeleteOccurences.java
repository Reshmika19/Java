package StringsProb;

public class DeleteOccurences {
    public static void main(String[] args) {
        String s = "ryeshymikay";
        char[] c = s.toCharArray();
        char key = 'y';
        String res = "";

        for(char i : c){
            if(i!=key){
                res = res + i;
            }
        }
        System.out.println(res);
    }
}
