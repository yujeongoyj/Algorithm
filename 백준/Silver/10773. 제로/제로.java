import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int poppedValue = 0;

        int K = Integer.parseInt(br.readLine());
        for (int i = 1; i <= K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            if (k != 0) {
                stack.push(k);
            } else if (k == 0) {
                stack.pop();
            }
        }
        int size = stack.size();

        for (int j = 0; j < size; j++) {
            int poppped = stack.pop();
            poppedValue += poppped;
        }
        bw.write(poppedValue + "\n");
        bw.flush();
        bw.close();


    }
}
