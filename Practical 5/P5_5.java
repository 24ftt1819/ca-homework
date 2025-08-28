import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class P5_5 {
        public static void main(String[] args) throws IOException {
        String filename = "C:/Practical 5/QReceipt.txt";

        FileWriter fw = new FileWriter(filename); 

        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();

        int num = (int) (Math.random()*100);

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String format = ldt.format(dtf);
        fw.write(format  +"\n");
        fw.write(" Hi, " + name.toUpperCase() + "\n");
        fw.write(" Your Queue No is : " + num);

        System.out.println("Receipt generated. Thank you.");

        fw.close();
       
    }
}

