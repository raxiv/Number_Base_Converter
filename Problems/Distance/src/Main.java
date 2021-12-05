import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double distance = scanner.nextDouble();
        double travelTime = scanner.nextDouble();



        double speed = distance/travelTime;

        System.out.println(speed);
    }
}