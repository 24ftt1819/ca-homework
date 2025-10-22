public class P9_1 {
    public static void main(String[] args) {
        
        double totalP = 0;
        double tP = 0;
        double tD = 0;
        int[][] rating = {
            {4, 5, 4}, {3, 5, 3}, {4, 5, 3}, {1, 2, 1} 
        };

        System.out.println("Rating\tProduct\tPackaging\tDelivery");

        for (int i = 0; i < rating.length; i++) {
            totalP += rating[i][0];
            tP += rating[i][1];
            tD += rating[i][2];
        }

        double avgP = totalP / rating.length;
        double avgPack = tP / rating.length;
        double avgD = tD / rating.length;

        System.out.printf("Average\t%.2f\t%.2f\t\t%.2f\n", avgP, avgPack, avgD);

        for (int i = 0; i < rating.length; i++) {
            double sum = 0;
            for (int j = 0; j < rating[i].length; j++) {
                sum += rating[i][j];
            }
            double avgC = sum / rating[i].length;
            System.out.printf("Customer " + (i+1) + " provide the average rating %.2f\n", avgC);
        }

    }
}
