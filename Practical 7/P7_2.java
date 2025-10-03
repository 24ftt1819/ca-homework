import java.util.Scanner;

public class P7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int round = 0;
        int uScore = 0;
        int cScore = 0;
        String ans = " ";

        int random = (int) (Math.random()*100);
        int rival = random % 3;

        do {
            System.out.print("\nEnter rock (0), paper (1), scissor (2): ");
        int num = input.nextInt();
        String empty = input.nextLine();

            if (rival == 0 && num == 0){
                System.out.println("The computer is rock. You are rock. It is a draw. ");
            }
            if (rival == 0 && num == 1){
                System.out.println("The computer is rock. You are paper. You Win. ");
                uScore++;
            }
            if (rival == 0 && num == 2){
                System.out.println("The computer is rock. You are scissor. You Lose. ");
                cScore++;
            }
            if (rival == 1 && num == 0){
                System.out.println("The computer is paper. You are rock. You Lose. ");
                cScore++;
            }
            if (rival == 1 && num == 1){
                System.out.println("The computer is paper. You are paper. It is a draw. ");
            }
            if (rival == 1 && num == 2){
                System.out.println("The computer is paper. You are scissor. You Win. ");
                uScore++;
            }
            if (rival == 2 && num == 0){
                System.out.println("The computer is scissor. You are rock. You Win. ");
                uScore++;

            }
            if (rival == 2 && num == 1){
                System.out.println("The computer is scissor. You are paper. You Lose. ");
                cScore++;
            }
            if (rival == 2 && num == 2){
                System.out.println("The computer is scissor. You are scissor. It is a draw. ");
            }
            round++;
            System.out.print("\nEnter y to play again: ");
            
            ans = input.nextLine();
        }

        while (ans.equalsIgnoreCase("y"));
        
        System.out.println("In the total of " + round +" round(s), " + "You scored " + uScore + " ,Computer scored " + cScore);
        if (uScore > cScore){
            System.out.println("You won the game.");
        }
        else if (uScore < cScore){
            System.out.println("You lose the game.");
        }
        else {
            System.out.println("It is a draw game.");
        }

        
        
        
    }
}
