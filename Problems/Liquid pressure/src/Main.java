import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double g = 9.8;

        double p = scanner.nextDouble();
        double h = scanner.nextDouble();

        double pressure = p*h*g;

        System.out.println(pressure);

    }
}