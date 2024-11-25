import java.io.*;
import java.util.*;

public class 카잉달력_규영 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-->0) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken())-1, y = Integer.parseInt(st.nextToken())-1;
            int ans = Integer.MAX_VALUE;
            for (int i = x; i < M*N; i += M) {
                if (i%N == y) {
                    ans = i+1;
                    break;
                }
            }
            if (ans == Integer.MAX_VALUE) ans = -1;
            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }
}