import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        int M = 0;
        for(int i = 1; i <= N; i++) {
            int num = i;
            int res = 0;

            while(num > 0) {
                res += num % 10;
                num /= 10;
            }
            if(res + i == N) {
                M = i;
                break;
            }
        }
        bw.write(M + "\n");
        bw.flush();
    }

}
