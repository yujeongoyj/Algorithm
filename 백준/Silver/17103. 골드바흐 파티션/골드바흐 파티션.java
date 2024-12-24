import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 100만까지의 소수를 구하기 위해 상한선 설정
        int MAX = 1000000;

        // 에라토스테네스의 체로 소수 배열 생성
        boolean[] isPrime = new boolean[MAX + 1];
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= MAX; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 테스트 케이스의 수
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int T = Integer.parseInt(br.readLine());
            int partition = 0;

            // 골드바흐 파티션을 찾기
            for (int p = 2; p <= T / 2; p++) {
                int q = T - p;
                if (isPrime[p] && isPrime[q]) {
                    partition++;
                }
            }

            // 결과 출력
            bw.write(partition + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
