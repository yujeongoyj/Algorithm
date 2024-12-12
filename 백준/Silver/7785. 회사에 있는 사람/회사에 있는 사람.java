import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> office = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();

            if (status.equals("enter")) {
                office.add(name);
            } else {
                office.remove(name);
            }
        }

        List<String> result = new ArrayList<>(office);
        Collections.sort(result, Collections.reverseOrder());

        for (String person : result) {
            bw.write(person + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
