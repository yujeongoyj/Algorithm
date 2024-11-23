import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

      int result = Math.min(Math.min(x, y), Math.min(w - x, h - y));
        System.out.println(result);
    }
}
