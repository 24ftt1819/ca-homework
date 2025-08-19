import java.util.Scanner;
public class P4_5 {
    public static void main(String[] args) {
        System.out.print("Enter the price of the 1st package: $");
        Scanner input = new Scanner(System.in);
        double package1 = input.nextDouble();
        System.out.print("Enter the weight of the 1st package in gram: ");
        int weight1 = input.nextInt();

        System.out.println(" ");

        System.out.print("Enter the price of the 2nd package: $");
        double package2 = input.nextDouble();
        System.out.print("Enter the weight of the 2nd package in gram: ");
        int weight2 = input.nextInt();

        double worth1 = weight1 / package1;
        double worth2 = weight2 / package2;

        System.out.println(" ");

        String value = (worth1 > worth2)? "It is worth more to buy the 1st package": "It is worth more to buy the 2nd package";
        System.out.println(value);


    }
}
