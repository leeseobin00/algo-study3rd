import java.io.*;
import java.util.*;

/*
    236792KB, 908ms
 */

public class 숫자카드2_규영 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) arr2[i] = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) hm.put(i, hm.getOrDefault(i, 0)+1);
        for (int i : arr2) {
            if (hm.containsKey(i)) sb.append(hm.get(i));
            else sb.append(0);
            sb.append(' ');
        }
        System.out.print(sb);
    }
}