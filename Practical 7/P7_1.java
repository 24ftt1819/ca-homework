public class P7_1 {
    public static void main(String[] args) {
        int num = 0;
        int numDo = 50;

        System.out.println("Below is generated using while loop: ");
        while (num!=20){
            
            num++;
            System.out.print(num + " ");
            
        }
        
        System.out.println("\nBelow is generated using dowhile loop: ");
        do {
            
            System.out.print(numDo + " ");
            numDo--;
        }
        while (numDo>=35);
        
        System.out.println("\nBelow is generated using for loop: "); 

        for (char letter = 'a' ; letter <= 'z'; letter++ ){
            System.out.print(letter + " ");
        }
    }
}
