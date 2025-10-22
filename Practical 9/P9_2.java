import java.util.Scanner;

public class P9_2 {
    public static void main(String[] args) {
        String res = " ";
       Scanner input = new Scanner(System.in);
       char[][] answers = {
            {'A','B','C','D','A','B'}, {'C','D','D','A','B','D'}, {'D','D','A','B','B','A'}, {'C','A','D','A','B','C'}  
        };

        System.out.println("Enter the key to the MCQ: ");
        char[] key = new char[6];
        for (int i = 0; i < key.length; i++) {
            key[i] = input.next().toUpperCase().charAt(0); 
        }

        for (int i = 0; i < answers.length; i++) {
            int correct = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (Character.toUpperCase(answers[i][j]) == key[j]) {
                    correct++;
                }
            }
            if (correct >= 3){
                res = " passed ";
            }
            else{
                res = " failed ";
            }
            
                System.out.println("Student " + i + "'s correct count is " + correct + ". Therefore, he/she " + res + " the test.");
            
        } 
    }
}
