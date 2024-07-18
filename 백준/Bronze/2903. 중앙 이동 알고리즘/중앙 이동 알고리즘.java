import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // 제곱하는 메소드
        int A = (int) Math.pow(2, N);
        int B = A + 1;
        int C = (int) Math.pow(B,2);
        System.out.println(C);


    }
}
