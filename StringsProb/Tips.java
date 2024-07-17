package StringsProb;

public class Tips {
    public static void main(String[] args) {
        //print a statement without using ;
        System.out.println();
        System.out.println("1. Print a statement without using ");
        if(System.out.printf("\tHai Resh") != null){

        }
        System.out.println();
        System.out.println();
        //print a semicolon without using ;
        System.out.println("2. Print a semicolon without using semicolon");
        //System.out.printf("%c" , 59); //here we are using to end statement , so the other method is
        //System.out.println();
        if(System.out.printf("\t%c",59)!=null){
        }
        System.out.println();
        //excute both if block and else block
        System.out.println();
        System.out.println("3. Excute both if block and else block");
        if(System.out.printf("\tICE")==null){

        }else{
            System.out.println("CREAM");
        }

        System.out.println();
        //excute multiple statement present if block and else block
        System.out.println();
        System.out.println("4. Excute multiple statement  if block and else block");
        if ((System.out.printf("Hai") == null) ||
                (System.out.printf("Helo") == null) ||
                (System.out.printf("Vanakam") == null))
        {
            // This block will not execute because the condition is false
        } else {
            System.out.println("RESH!");
        }

        System.out.println();
        //Increment and Decrement
        System.out.println();
        System.out.println("5. Increment and Decrement");
        int a = 5;
        ++a; //pre increment
        System.out.println(a);
        a = 5;
        a++; //post decrement
        System.out.println(a);

    }
}
