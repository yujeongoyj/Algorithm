

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        int x4 = (x == x2) ? x3 : (x == x3) ? x2 : x;
        int y4 = (y == y2) ? y3 : (y == y3) ? y2 : y;

        System.out.println(x4 + " " + y4);
    }
}
