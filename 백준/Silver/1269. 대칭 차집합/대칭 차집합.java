import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> setA = new HashSet<>();
        HashSet<String> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            setA.add(st.nextToken());
        }
      
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            setB.add(st.nextToken());
        }


        HashSet<String> diffA = new HashSet<>(setA);
        diffA.removeAll(setB);
        HashSet<String> diffB = new HashSet<>(setB);
        diffB.removeAll(setA);

        int result = diffA.size() + diffB.size();
        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();


    }
}
