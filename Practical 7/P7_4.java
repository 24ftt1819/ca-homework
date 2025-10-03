import java.util.Scanner;

public class P7_4 {
    public static void main(String[] args) {
        int term0 = 0;
        int term1 = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the term: ");
        int term = input.nextInt();
        
        for (int i = 0; i != term; i++){
            int temp = term1 + term0;
            term0 = term1;
            term1 = temp;
        }
        System.out.println("At term " + term + " the number is " + term0);
    }
}
