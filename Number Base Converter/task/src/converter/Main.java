package converter;

import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        stage3();


    }


    public static void stage3() {
        boolean flag = true;

        while (flag) {

            System.out.println("Enter two numbers in format: {source base} {target base} (To quit type /exit)");

            String option = scanner.nextLine();

            String[] array = option.split(" ");


            if (array[0].equals("/exit")) {
                flag = false;
                break;
            } else {
                BigInteger sourceBase = new BigInteger(array[0]);
                int targetBase = Integer.parseInt(array[1]);

                boolean inner = true;
                while (inner) {
                    System.out.println("Enter number in base {user source base} to convert to base {user target base} (To go back type /back)");
                    String option2 = scanner.nextLine();
                    if (option2.equals("/back")) {
                        inner = false;
                        break;
                    } else {
                        BigInteger number = new BigInteger(option2);
                        String decimal = new BigInteger(option2, Integer.parseInt(array[0])).toString();
                        String output = new BigInteger(decimal).toString(targetBase);
                        System.out.println("Conversion result: " + output);
                    }

                }
            }

        }
    }


    public static void converter() {
        boolean flag = true;

        while (flag) {
            System.out.println("Do you want to convert /from decimal or /to decimal? (To quit type /exit)");
            String option = scanner.nextLine();

            switch (option) {
                case "/from":
                    decimal();
                    break;
                case "/to":
                    toDecimal();
                    break;


                case "/exit":
                    flag = false;
                    break;
            }

        }
    }


    public static void toDecimal() {

        System.out.println("Enter source number:");
        String source = scanner.nextLine();
        System.out.println("Enter source base:");
        int sourceBase = scanner.nextInt();

        switch (sourceBase) {
            case 2:
            case 8:
            case 16:
                int decimal = Integer.parseInt(source, sourceBase);
                System.out.println("Conversion to decimal result: " + decimal);
                break;
        }

    }


    public static void decimal() {
        System.out.println("Enter number in decimal system:");
        int decimal = scanner.nextInt();
        System.out.println("Enter target base:");
        int targetBase = scanner.nextInt();
        scanner.nextLine();
        int result = 0;


        switch (targetBase) {

            case 2:
                List<Integer> binary = new ArrayList<>();
                int index = 0;
                while (decimal > 0) {
                    binary.add(decimal % 2);
                    decimal /= 2;
                }
                Collections.reverse(binary);
                System.out.print("Conversion result: ");
                for (int b : binary) {
                    System.out.print(b);
                }
                System.out.println("");
                break;
            case 8:
                String resultt = Integer.toOctalString(decimal);
                System.out.println("Conversion result: " + resultt);
                break;
            case 16:
                int rem;
                String hex = "";
                char[] hexchars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                while (decimal > 0) {
                    rem = decimal % 16;
                    hex = hexchars[rem] + hex;
                    decimal = decimal / 16;
                }
                System.out.println("Conversion result: " + hex);
                break;

            default:
                System.out.println("Wrong input");
                break;
        }


    }

}
