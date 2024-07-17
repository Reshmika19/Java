package Zoho;

public class NotesCounter {
    public static void main(String[] args) {
        int[] notesCounter = {2000,1000,500,200,100,50,10,5,1};
        int[] notes = new int[9];

        int n = 1541;
        for(int i = 0 ; i<9 ; i++){
            if(n >= notesCounter[i]){
                notes[i] = n / notesCounter[i];
                n = n % notesCounter[i];
            }
        }

        for(int i = 0 ; i<9 ; i++){
            if(notes[i]!=0){
                System.out.println(notesCounter[i] + " : " + notes[i] );
            }
        }
    }
}
