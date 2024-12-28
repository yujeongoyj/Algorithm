import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (true) {
            s = br.readLine(); 
            if (s.equals(".")) { 
                break;
            }

            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

           
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

              
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                }
              
                else if (c == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        isValid = false;
                        break;
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        isValid = false;
                        break;
                    }
                } else if (c == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        isValid = false;
                        break;
                    }
                }
            }

         
            if (!stack.isEmpty()) {
                isValid = false;
            }

            if (isValid) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }

        bw.flush();
    }
}
