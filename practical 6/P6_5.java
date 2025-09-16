import java.util.Scanner;

public class P6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an arithmetic expression: ");
        int num1 = input.nextInt();
        String ope = input.next();
        int num2 = input.nextInt();
        int ans = 0;

        if (num2 == 0) {
            System.out.println("Math error: The divisor cannot be Zero");
        }
        else {
            switch (ope){
                case "+":
                ans = num1 + num2;
                System.out.println("The sum is " + ans);
                break;
                case "-":
                ans = num1 - num2;
                System.out.println("The subtraction is " + ans);
                break;
                case "*":
                ans = num1 * num2;
                System.out.println("The multiplication is " + ans);
                break;
                case "/":
                ans = num1 / num2;
                System.out.println("The division is " + ans);
                break;
                default:
                System.out.println("Please use an arithmetic expression");
            }
        }


    }
}
