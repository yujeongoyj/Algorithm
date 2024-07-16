import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // N진수를 10진수로 변환하기 위해 parseInt()메서드 사용
        // 첫번째 인자에는 변환할 문자열, 두번째 인자에는 변환할 문자열의 진법을 넣어 10진수로 변환할 수 있다.
        Scanner scanner = new Scanner(System.in);

        // B진법의 숫자 입력받기
        String A = scanner.next();
        // 몇진법인지 입력받기
        int N = scanner.nextInt();

        int decimal = Integer.parseInt(A, N);
        System.out.println(decimal);


    }
}