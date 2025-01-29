import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int locationsCount = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < locationsCount; i++) {

            double expectedAverageGold = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());


            double totalGold = 0;


            for (int j = 0; j < days; j++) {
                double dailyGold = Double.parseDouble(scanner.nextLine());
                totalGold += dailyGold;
            }


            double averageGoldPerDay = totalGold / days;


            if (averageGoldPerDay >= expectedAverageGold) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGoldPerDay);
            } else {
                double goldNeeded = expectedAverageGold - averageGoldPerDay;
                System.out.printf("You need %.2f gold.%n", goldNeeded);
            }
        }
    }
}