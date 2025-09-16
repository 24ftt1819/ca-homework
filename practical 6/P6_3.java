import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class P6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aUser = "Ahmad Ali";
        String aPass = "12345";
        System.out.println("Please enter your username:");
        String user = input.nextLine();
        user = user.trim();
        System.out.println("Please enter the password:");
        String pass = input.nextLine();
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        String format = ldt.format(dtf);

        if (aUser.equals(user)) {
            if (aPass.equals(pass)){
                System.out.println("Welcome Ahmad Ali. The time now is " + format);
            }
            else {
                System.out.println("Error: Password does not match.");
            }

        }
        else {
            System.out.println("Error: Invalid Username.");
        }

    }
}
