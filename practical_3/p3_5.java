import java.util.Scanner;
public class p3_5 {
    public static void main(String[] args) {
        final int day = 30;
        System.out.print("What is your target amount? $");
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        System.out.print("How many month(s) to reach your goal? ");
        int goal = input.nextInt();
        int days = goal*day;
        double amount = (double) target/days;
        System.out.printf("the amount you need to save per day is $%.2f", amount);


    }
    
}
