import java.util.Scanner;
public class p3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of byte(s) to be converted: ");
        int num = input.nextInt();
        int convert = num*8;
        System.out.println(num + " byte(s) is "+ convert + " bits.");
    }
}
