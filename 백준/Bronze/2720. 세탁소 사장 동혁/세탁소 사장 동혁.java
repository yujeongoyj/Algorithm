
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Quarter = 25;
        int Dime = 10;
        int Nickel = 5;
        int Penny = 1;

        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            int change = scanner.nextInt(); 

            int quarters = change / Quarter; 
            change %= Quarter; 

            int dimes = change / Dime; 
            change %= Dime; 

            int nickels = change / Nickel; 
            change %= Nickel; 

            int pennies = change / Penny; 

            System.out.println(quarters + " " + dimes + " " + nickels + " " + pennies);
        }
    }
}
