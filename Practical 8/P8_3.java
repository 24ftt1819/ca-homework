import java.util.Scanner;

public class P8_3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int [] list = {0,1,2,3,4,5,6,7,8,9};
      
      for (int i = 0; i < list.length; i++){
        int index = (int) (Math.random() * list.length);
        int temp = list[i];
        list[i]=list[index];
        list [index] = temp;
      }
      int chance = 10;
      int[] guess = new int[4];

      while (chance > 0){
        System.out.println("\nGuess 4 numbers (no duplicates):");
            for (int i = 0; i < 4; i++) {
                guess[i] = input.nextInt();
            }
            int score = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == list[i]) {
                    score++; 
                }
            }
            if (score == 4) {
                System.out.println("You Won! You got the actual number!");
                break;
            } else {
                chance--;
            if (chance > 0) {
                System.out.println("You have score " + score + " out of 4. You have " + chance + " chances left.");
            } else {
                System.out.print("The actual number is ");
                for (int i = 0; i < 4; i++) {
                    System.out.print(list[i] + " ");
                }
                System.out.println("You Lose.");
            }
        }
      }
    }
}
