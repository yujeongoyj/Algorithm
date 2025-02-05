import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        String[] answer = new String[strings.length];
        String[] result = new String[strings.length];
        for(int i =0; i < strings.length; i++) {
            result[i] = String.valueOf(strings[i].charAt(n)) + strings[i];
        }
        Arrays.sort(result);
        
        
        for(int i =0; i< result.length; i++) {
            answer[i] = result[i].substring(1);
        }
        return answer;
    }
}