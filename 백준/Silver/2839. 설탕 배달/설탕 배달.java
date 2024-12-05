import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        int count = 0;

        while(N >= 0) {
            if(N % 5 == 0) {
                count += N /5;
                bw.write(count + "\n");
                bw.flush();
                return;
            }
            N -= 3;
            count++;
        }
        bw.write(-1+ "\n");
        bw.flush();


    }
}
