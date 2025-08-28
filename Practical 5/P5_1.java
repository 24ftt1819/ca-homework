import java.util.Scanner;
public class P5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String word = input.nextLine();
        System.out.print("Enter the second word: ");
        String word1 = input.nextLine();

        System.out.println("Are both words the same? " + word.equalsIgnoreCase(word1));
    }
}
