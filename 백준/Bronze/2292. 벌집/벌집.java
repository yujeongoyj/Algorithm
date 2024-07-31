import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 벌집 층의 갯수는 이전 층 + 6 = 6(n-1)
        // 최소거리는 해당 숫자의 층과 같음
        // n에 있는 층의 마지막 숫자는 {(n-1)/n}/2

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(calculate(n));
    }

    public static int calculate(int n) {
        int layer = 1;
        int lastRoomNumber = 1;

        while (lastRoomNumber < n) {
            lastRoomNumber = lastRoomNumber + (6 * layer);
            layer++;
        }
        return layer;

    }
}
