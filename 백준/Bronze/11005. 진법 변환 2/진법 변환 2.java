import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 자바에서는 Integer.toString(int i, int radix)를 사용하여 10진수 i를 raidx 진법으로 변환할 수 있다.
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int B = scanner.nextInt();


        String changeN = Integer.toString(N,B).toUpperCase();
        System.out.println(changeN);
    }
}
