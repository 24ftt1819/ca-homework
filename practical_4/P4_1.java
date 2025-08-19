import java.util.Scanner;
public class P4_1 {
    public static void main(String[] args) {
        double random1 = Math.random();
        double random2 = Math.random();
        double sum1 = random1 * 100;
        double sum2 = random2 * 100;
        int sumInt1 = (int) sum1;
        int sumInt2 = (int) sum2;



        System.out.println("What is " + sumInt1 + " + " + sumInt2 + " ? ");
        Scanner input = new Scanner(System.in);
        int ans = input.nextInt();
        int aSum = sumInt1 + sumInt2;
        System.out.println(sumInt1 + " + " + sumInt2 + " = " + ans + " is " + (aSum==ans));

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("What is " + sumInt1 + " % " + sumInt2 + " ? ");
        int ans2 = input.nextInt();
        int dSum = sumInt1 % sumInt2;
        System.out.println(sumInt1 + " % " + sumInt2 + " = " + ans2 + " is " + (dSum==ans2));


    }
}
