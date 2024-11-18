

import java.util.Scanner;

import static java.nio.file.Files.size;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();

        int dailyUp = A - B;

        int days = (V-A)/dailyUp;

        // 정상에 도달하기 위해서는 마지막 날을 제외한 나머지
        // 구간에서 올라가는 만큼을 계산해야 한다.
        // ->  마지막 날전까지는 V-A만큼을
        // 마지막 날에 A만큼 올라가면 정상에 도달하게 된다.

        // V-A 만큼 올라가는데 걸리는 시간 계산하기 (일수로 나누기)
         if((V-A) % dailyUp != 0) {
             days++;
         }
         days++;
        System.out.println(days);
    }
}
