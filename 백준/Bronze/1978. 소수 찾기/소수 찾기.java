

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();

            if (isPrime(number)) {
                count++;
            }
        }
        System.out.println(count);
    }
        private static boolean isPrime (int num){
            if (num <= 1) return false;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

