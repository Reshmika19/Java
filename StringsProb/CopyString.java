package StringsProb;

public class CopyString {
    public static void main(String[] args) {
        String s = "Reshmika";
        char name[] = s.toCharArray();
        char[] copy = new char[name.length];
        //int j = 0;
        for(int i = 0; i< name.length;i++){
            copy[i] = name[i];
            //j++;

        }
        System.out.println(copy);
    }
}
