import java.util.Scanner;

public class P5_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String message = input.nextLine();

        System.out.print("Enter the substring to replace: ");
        String replace = input.nextLine();

        System.out.print("Enter the replacement string: ");
        String replacement = input.nextLine();

        String newMessage = message.replace(replace, replacement);

        System.out.println("The updated message is: \n" + newMessage);
    }
}
