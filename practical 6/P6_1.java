import java.util.Scanner;

public class P6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rock (0), paper (1), scissor (2)");
        int num = input.nextInt();

        int random = (int) (Math.random()*100);
        int rival = random % 3;


        if (rival == 0 && num == 0){
            System.out.println("The computer is rock. You are rock. It is a draw. ");
        }
        if (rival == 0 && num == 1){
            System.out.println("The computer is rock. You are paper. You Win. ");
        }
        if (rival == 0 && num == 2){
            System.out.println("The computer is rock. You are scissor. You Lose. ");
        }
        if (rival == 1 && num == 0){
            System.out.println("The computer is paper. You are rock. You Lose. ");
        }
        if (rival == 1 && num == 1){
            System.out.println("The computer is paper. You are paper. It is a draw. ");
        }
        if (rival == 1 && num == 2){
            System.out.println("The computer is paper. You are scissor. You Win. ");
        }
        if (rival == 2 && num == 0){
            System.out.println("The computer is scissor. You are rock. You Win. ");

        }
        if (rival == 2 && num == 1){
            System.out.println("The computer is scissor. You are paper. You Lose. ");
        }
        if (rival == 2 && num == 2){
            System.out.println("The computer is scissor. You are scissor. It is a draw. ");
        }
        
    }
}
