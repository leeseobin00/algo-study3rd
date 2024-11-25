import java.io.*;

public class 문자열분석_규영 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            int[] arr = new int[4];
            for (char c : line.toCharArray()) {
                if ('a' <= c && c <= 'z') arr[0]++;
                else if ('A' <= c && c <= 'Z') arr[1]++;
                else if ('0' <= c && c <= '9') arr[2]++;
                else if (c == ' ') arr[3]++;
            }
            for (int i : arr) sb.append(i).append(' ');
            sb.append('\n');
        }
        System.out.print(sb);
    }
}