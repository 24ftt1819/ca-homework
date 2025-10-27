import java.util.Scanner;

public class P10_2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int random;
        do {
       random = (int)(Math.random() * 900) + 100; 
       } while (random % 10 == 0);
        int number = random;
        System.out.print("Enter the reverse of " + number+ ": ");
        int uInput = input.nextInt();
        while (uInput < 100 || uInput > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + number + ": ");
            uInput = input.nextInt();
        }
        int reverse = reverse(number);
        boolean result = isPalindrome(uInput, reverse);

        System.out.println("The digit " + uInput + " is palindrome of " + number + " is " + result + ".");
    }
    public static int reverse(int number){
        int rev = 0;
        while (number != 0) {
            rev = rev * 10 + number % 10;
            number /= 10;
        }
    return rev;

    }
    public static boolean isPalindrome(int uInput, int reverse) {
        return uInput==reverse;
    }
}
