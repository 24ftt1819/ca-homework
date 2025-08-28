import java.util.Scanner;
public class P5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 5 letters word: ");
        String word = input.nextLine();
        String reverse = " ";
        if(word.length() == 5) {
            reverse = " " + word.charAt(4) + word.charAt(3) 
            + word.charAt(2) + word.charAt(1) + word.charAt(0) ;

            System.out.println("The reverse of the word " + word + " is " + reverse);
        }
        else {
            System.out.println("Please type in only 5 letters");
        }
    
        // if(word.length() != 5)
        // for (int length = word.length() - 1; length >=0; length--) {
        //     reverse= reverse + word.charAt(length);
        // }
        
        
    }
}
