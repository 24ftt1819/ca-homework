import java.util.Scanner;

public class P7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;
        int count = 0;

        System.out.println("Enter numbers, the input ends with 0 entered: ");
        
        while (true){
            int num = input.nextInt();
            if (num == 0){
                break;
            }
            else {
                if (num == largest){
                    count++;
                }
                if (num > largest){
                    largest = num;
                    count = 1;
                }

            }


        }
        System.out.println("The largest number is " + largest);
        System.out.println("The occurrence count of the largest number is " + count);

    }
}
