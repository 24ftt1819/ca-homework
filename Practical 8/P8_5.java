import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P8_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 10;
        int[] dup = new int[num];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < num; i++) {
            dup[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (dup[i] == dup[j]) {
                    dup[j] = 0; 
                }
            }
        }
        System.out.print("The distinct numbers are: ");
        Arrays.sort(dup);
        for (int i : dup){
            if (i !=0){
                System.out.print(i + " ");
            }
        }

    }
}
