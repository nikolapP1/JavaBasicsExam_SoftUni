import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int foodInKg = Integer.parseInt(scanner.nextLine());
        int totalFoodInGrams = foodInKg * 1000;


        int totalFoodEaten = 0;


        while (true) {
            String input = scanner.nextLine();


            if (input.equals("Adopted")) {
                break;
            }


            int foodEaten = Integer.parseInt(input);
            totalFoodEaten += foodEaten;
        }


        if (totalFoodInGrams >= totalFoodEaten) {
            int leftovers = totalFoodInGrams - totalFoodEaten;
            System.out.printf("Food is enough! Leftovers: %d grams.%n", leftovers);
        } else {
            int foodNeeded = totalFoodEaten - totalFoodInGrams;
            System.out.printf("Food is not enough. You need %d grams more.%n", foodNeeded);
        }
    }
}