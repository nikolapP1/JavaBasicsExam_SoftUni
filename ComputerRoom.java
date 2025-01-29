import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int spentHours = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        String partOfTheDay = scanner.nextLine();
        double pricePerPerson = 0.0;
        switch (month)
        {
            case "march":
            case "april":
            case "may":
                if(partOfTheDay.equals("day"))
                {
                    pricePerPerson = 10.50;
                }
                else if(partOfTheDay.equals("night"))
                {
                    pricePerPerson = 8.40;
                }
                break;
            case "june":
            case "july":
            case "august":
                if(partOfTheDay.equals("day"))
                {
                    pricePerPerson = 12.60;
                }
                else if(partOfTheDay.equals("night"))
                {
                    pricePerPerson = 10.20;
                }
                break;
        }
        if(people>=4)
        {
            pricePerPerson *= 0.90;
        }
        if(spentHours>=5)
        {
            pricePerPerson *= 0.50;
        }
        double totalCost = pricePerPerson*spentHours*people;

        System.out.printf("Price per person for one hour: %.2f%n",pricePerPerson);
        System.out.printf("Total cost of the visit: %.2f%n",totalCost);

    }
}
