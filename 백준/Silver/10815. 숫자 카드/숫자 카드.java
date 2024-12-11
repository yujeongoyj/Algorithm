import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> nSet = new HashSet();
        for(int i = 0; i < N; i++) {
            nSet.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++) {
            int card = Integer.parseInt(st.nextToken());
            if(nSet.contains(card)) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }
        bw.flush();
        bw.close();

    }
}
