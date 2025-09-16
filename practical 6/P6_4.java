import java.util.Scanner;

public class P6_4 {
    public static void main(String[] args) {
        int num = 0;
        String month = " ";
        Scanner input = new Scanner(System.in);
        System.out.println("Is your birth month in Set 1? \n1 3 5 7 9 11");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        int bin = input.nextInt();
        System.out.println("");
        if (bin == 1){
            num += 1;
        }
        System.out.println("Is your birth month in Set 2? \n2 3 6 7 11");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        bin = input.nextInt();
        System.out.println("");
        if (bin == 1){
            num += 2;
        }
        System.out.println("Is your birth month in Set 3? \n4 5 6 7 12");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        bin = input.nextInt();
        System.out.println("");
        if (bin == 1){
            num += 4;
        }
        System.out.println("Is your birth month in Set 4? \n8 9 10 11 12");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        bin = input.nextInt();
        System.out.println("");
        if (bin == 1){
            num += 8;
        }

        switch (num) {
            case 1:
            month = "January";
            break;
            case 2:
            month = "February";
            break;
            case 3:
            month = "March";
            break;
            case 4:
            month = "April";
            break;
            case 5:
            month = "May";
            break;
            case 6:
            month = "June";
            break;
            case 7:
            month = "July";
            break;
            case 8:
            month = "August";
            break;
            case 9:
            month = "September";
            break;
            case 10:
            month = "October";
            break;
            case 11:
            month = "November";
            break;
            case 12:
            month = "December";
            break;
            default: 
            month = "Invalid input";
        }

        if (num == 0 || num >=13) {
            System.out.println(month);
        }
        if (num >= 1 && num <= 12){
            System.out.println("You are born in " + month);
        }


    }
}
