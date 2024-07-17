package Zoho;

public class Hex2Bin {
    public static void main(String[] args) {
        String hexval = "ABCDEF";
        String res = HextoBin(hexval);
        System.out.println(res);
    }
    public static String HextoBin(String hexVal){
        String[] hexa = { "0000" , "0001" , "0010" , "0011" ,
                "0100" , "0101" , "0110" , "0111" ,
                "1000" , "1001" , "1010" , "1011" ,
                "1100" , "1101" , "1110" , "1111"
        };
        String binNum = "";
        for(int i = 0 ; i<hexVal.length() ; i++){
            binNum += hexa[Character.digit(hexVal.charAt(i) , 16)];
        }
        return binNum;
    }
}


