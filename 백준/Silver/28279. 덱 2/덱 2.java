import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new ArrayDeque<Integer>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            switch (n) {
                case 1:
                    int x = Integer.parseInt(st.nextToken());
                    deque.addFirst(x);
                    break;
                case 2:
                    x = Integer.parseInt(st.nextToken());
                    deque.addLast(x);
                    break;
                case 3:
                   if(deque.isEmpty()) {
                       bw.write("-1" + "\n");
                   } else {
                       bw.write(deque.pollFirst()+ "\n");
                   } break;
                case 4:
                    if(deque.isEmpty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(deque.pollLast()+ "\n");
                    } break;

                case 5:
                    bw.write(deque.size() + "\n");
                    break;
                case 6:
                    if (deque.isEmpty()) {
                        bw.write("1" + "\n");
                    } else {
                        bw.write("0" + "\n");
                    }
                    break;
                case 7:
                    if (deque.isEmpty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(deque.getFirst() + "\n");
                    }
                    break;
                case 8:
                    if (deque.isEmpty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(deque.getLast() + "\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
