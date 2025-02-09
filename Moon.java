import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double averageSpeed = Double.parseDouble(scanner.nextLine());
        double litresFor100Km = Double.parseDouble(scanner.nextLine());

        double totalHours = (2*384400)/averageSpeed + 3;
        int hours = (int) Math.ceil(totalHours);
        double usedLitres = (litresFor100Km*768800)/100;
        int totalLitres = (int) Math.ceil(usedLitres);

        System.out.println(hours);
        System.out.print(totalLitres);

    }
}