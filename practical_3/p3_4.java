import java.util.Scanner;
public class p3_4 {
    public static void main(String[] args) {
        double durian = 15.75;
        System.out.println("Each durian cost $15.75");
        Scanner input = new Scanner(System.in);
        System.out.print("How much money do you have? $");
        double money = input.nextDouble();

        int count = (int) (money / 15.75);
        System.out.println("The number of durian(s) you can buy is " + count);

        
    }
}
