import java.util.Scanner;
public class P4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 100 and 999: ");
        int num = input.nextInt();
        int re = num % 10;
        int ver = (num /10 )% 10;
        int se = num / 100;

        System.out.println("The reverse of " + num + " is " + re + ver + se);


    }
}
