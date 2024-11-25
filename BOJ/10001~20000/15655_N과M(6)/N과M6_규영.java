import java.io.BufferedReader;

import java.io.*;
import java.util.*;

public class N과M6_규영 {
    static int N, M;
    static int[] arr, arr2;
    static boolean[] visited;
    static StringBuilder sb;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        arr2 = new int[M];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        visited = new boolean[N];
        choice(0, 0);
        System.out.print(sb);
    }
    static void choice(int start, int idx) {
        if (idx == M) {
            for (int i : arr2) sb.append(i).append(' ');
            sb.append('\n');
            return;
        }
        for (int i = start; i < N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            arr2[idx] = arr[i];
            choice(i, idx+1);
            visited[i] = false;
        }
    }
}