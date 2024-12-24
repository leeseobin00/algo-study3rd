import java.io.*;

/*
    11492KB, 64ms
 */

public class ROT13_규영 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] str = br.readLine().toCharArray();
        for (char c : str) {
            if ('a' <= c && c <= 'z') {
                if ('z' < c+13) sb.append((char)(c-13));
                else sb.append((char)(c+13));
            } else if ('A' <= c && c <= 'Z') {
                if ('Z' < c+13) sb.append((char)(c-13));
                else sb.append((char)(c+13));
            } else sb.append(c);
        }
        System.out.print(sb);
    }
}