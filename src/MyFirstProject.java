import java.util.Scanner;

public class MyFirstProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a digit");
        int digit = input.nextInt();
        int user = 0;
        int digit1 , digit2 , digit3 , digit11 , digit12 , digit13 , digit14;
        int num1 , num2 , num3 , num11 , num12 , num13 , num14;
        int guess1 , guess2;

        if (digit == 3) {
            digit1 = 0;
            digit2 = 0;
            digit3 = 0;
            guess1 = 0;

            while (digit1 == digit2 || digit1 == digit3 || digit2 == digit3) {

                guess1 = (int) ((Math.random() * 899) + 100);
                System.out.println(guess1);
                digit1 = guess1 / 100;
                digit2 = (guess1 / 10) % 10;
                digit3 = guess1 % 10;
            }

            do {
                user = input.nextInt();
                num1 = user / 100;
                num2 = (user / 10) % 10;
                num3 = user % 10;

                if (num1 == digit1 || num1 == digit2 || num1 == digit3 ||num2 == digit2 || num2 == digit1 ||
                        num2 == digit3 || num2 == digit1 || num2 == digit3 || num3 == digit1 || num3 == digit2) {
                    if (num1 == digit1) {
                        System.out.print("+");
                    } else if (num1 == digit2 || num1 == digit3)
                        System.out.print("-");
                    if (num2 == digit2) {
                        System.out.print("+");
                    } else if (num2 == digit1 || num2 == digit3)
                        System.out.print("-");
                    if (num3 == digit3) {
                        System.out.print("+");
                    } else if (num3 == digit1 || num3 == digit2)
                        System.out.println("-");
                }else
                    System.out.println("No Match ");


            } while (user != guess1);
            System.out.print(" : Correct");
        } else if (digit == 4) {
            digit11 = 0;
            digit12 = 0;
            digit13 = 0;
            digit14 = 0;
            guess2 = 0;

            while (digit11 == digit12 || digit11 == digit13 || digit11 == digit14 || digit12 == digit13 || digit12 == digit14 || digit13 == digit14) {

                guess2 = (int) ((Math.random() * 10000) + 1);
                System.out.println(guess2);
                digit11 = guess2 / 1000;
                digit12 = (guess2 / 100) % 10;
                digit13 = (guess2 / 10) % 10;
                digit14 = guess2 % 10;
            }


            do {
                user = input.nextInt();
                num11 = user / 1000;
                num12 = (user / 100) % 10;
                num13 = (user / 10) % 10;
                num14 = user % 10;
                if (num11 == digit11 || num11 == digit12 || num11 == digit13 || num11 == digit14 || num12 == digit12 || num12 == digit11 || num12 == digit13 || num12 == digit14 || num13 == digit13
                        || num13 == digit11 || num13 == digit12 || num13 == digit14 || num14 == digit14 || num14 == digit11 || num14 == digit12 || num14 == digit13 ) {
                    if (num11 == digit11) {
                        System.out.print("+");
                    } else if (num11 == digit12 || num11 == digit13 || num11 == digit14)
                        System.out.print("-");
                    if (num12 == digit12) {
                        System.out.print("+");
                    } else if (num12 == digit11 || num12 == digit13 || num12 == digit14)
                        System.out.print("-");
                    if (num13 == digit13) {
                        System.out.print("+");
                    } else if (num13 == digit11 || num13 == digit12 || num13 == digit14)
                        System.out.print("-");
                    if (num14 == digit14) {
                        System.out.print("+");
                    } else if (num14 == digit11 || num14 == digit12 || num14 == digit13)
                        System.out.println("-");

                }else
                    System.out.println("Not match");

            } while (user != guess2);
            System.out.print(" : Correct");
        } else {
            System.out.println("Your digit number does not exist");
        }
    }
}
