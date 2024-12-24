import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int i = 1;
        while (i * i <= N) {
            count++;
            i++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
