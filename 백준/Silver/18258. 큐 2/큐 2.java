import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<Integer>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    queue.add(x);
                    break;
                case "pop":
                    Integer n = queue.poll();
                    if (n == null) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(n + "\n");
                    }
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        bw.write("1" + "\n");
                    } else {
                        bw.write("0" + "\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(queue.peek() + "\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(((LinkedList<Integer>) queue).peekLast() + "\n");
                    }
                    break;
            }

        }
        bw.flush();
        bw.close();
    }

}
