import java.util.Scanner;

public class P8_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.println("How many numbers are there? ");
        int temp = input.nextInt(); 
        int[] list = new int[temp];

        System.out.println("Enter the " + temp + " numbers:");
        for (int i = 0; i < temp; i++) {
            list[i] = input.nextInt(); 
        }

        System.out.println("Enter number of left shifts:");
        int shift = input.nextInt(); 
        shift = shift % temp; 

        for (int i = 0; i < shift; i++) {
            int first = list[0]; 
            for (int j = 0; j < temp - 1; j++) {
                list[j] = list[j + 1]; 
            }
            list[temp - 1] = first; 
        }

        System.out.println("The shifted arrangement is:");
        for (int i = 0; i < temp; i++) {
            System.out.print(list[i] + " "); 
        }


    }
}
