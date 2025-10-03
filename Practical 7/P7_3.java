import java.util.Scanner;

public class P7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int posi = 0;
        int negative = 0;
        int count = 0;
        double ave = 0;
        System.out.println("Enter an integer, the input ends if it is 0: ");

        while (true){
            
            int num = input.nextInt();
            if (num == 0){
                break;
            }
            else{
                count++;
                total+=num;
                if (num > 0){
                    posi++;
                }
                else {
                    negative++;
                }
            }

        }
        if (count ==0){
            System.out.println("\nNo number is entered except for 0 to end the program. ");
        }
        else{
            System.out.println("\nThe number of positive is " + posi);
            System.out.println("The number of negative is " + negative);
            System.out.println("The total is " + total);
            ave = (double) total/count;
            System.out.printf("The average is %.2f" , ave);
        }
    }
}
