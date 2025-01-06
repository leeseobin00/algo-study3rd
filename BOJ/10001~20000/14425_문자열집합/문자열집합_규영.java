import java.io.*;
import java.util.*;

/*
    38952KB, 300ms
 */

public class 문자열집합_규영 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        HashSet<String> hs = new HashSet<>();
        int ans = 0;
        for (int i = 0; i < N; i++) hs.add(br.readLine());
        for (int i = 0; i < M; i++) {
            if (hs.contains(br.readLine())) ans++;
        }
        System.out.print(ans);
    }
}