import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int n = scanner.nextInt();
            if(n == -1) {
                break;  // -1이면 종료
            }

            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;

            // n의 약수 구하기 (n을 제외한 약수들만 구함)
            for(int i = 1; i < n; i++) {
                if(n % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }

            // sum이 n과 같으면 완전수 출력
            if(sum == n) {
                System.out.print(n + " = ");
                for(int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i));
                    if(i != list.size() - 1) {  // 마지막 약수 뒤에는 +를 추가하지 않음
                        System.out.print(" + ");
                    }
                }
                System.out.println();  // 끝에 줄바꿈
            } else {
                System.out.println(n + " is NOT perfect.");  // 완전수가 아닌 경우
            }
        }

        scanner.close();
    }
}
