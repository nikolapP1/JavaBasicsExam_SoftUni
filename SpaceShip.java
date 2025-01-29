import java.util.Scanner;

public class SpaceShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double avgHeightOfAstronaut = Double.parseDouble(scanner.nextLine());
        double rocketVolume = a*b*h;
        double roomVolume = 2*2*(avgHeightOfAstronaut + 0.40);
        double doubleAstronauts = rocketVolume/roomVolume;
        int astronauts = (int) Math.floor(doubleAstronauts);
        if(astronauts<3)
        {
            System.out.println( "The spacecraft is too small.");
                    }
       else if(astronauts>10)
        {
            System.out.println("The spacecraft is too big.");
        }
       else if(astronauts>=3&&astronauts<=10)
        {
            System.out.printf("The spacecraft holds %d astronauts.",astronauts );
        }
    }
}
