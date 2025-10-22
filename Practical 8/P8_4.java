import java.util.Scanner;

public class P8_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Bscore = 0;
        System.out.println("Enter the number of students: ");
        int student = input.nextInt(); 
        int[] score = new int[student];

        System.out.println("\nEnter the " + student + " scores" );
        for (int i = 0; i < student; i++) {
            score[i] = input.nextInt();
            if (score[i] > Bscore){
                Bscore = score[i];
            }
        }
        System.out.println(" ");
        for (int i = 0; i < student; i++){
            char grade;
            if (score[i] >= Bscore - 10) {
                grade = 'A';
            } else if (score[i] >= Bscore - 20) {
                grade = 'B';
            } else if (score[i] >= Bscore - 30) {
                grade = 'C';
            } else if (score[i] >= Bscore - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Student " + (i+1) + " score is " + score[i] + " and grade is " + grade);
        }

        
    }
}
