import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M1_서빈 {
	static int n, m;
	static boolean visited[];    // 중복 X
	static int result[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		visited = new boolean[n];
		result = new int[m];

		dfs(0);
		System.out.println(sb.toString());
	}

	public static void dfs(int count) {
		if (count == m) {
			for (int i = 0; i < m; i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				continue;
			}
			result[count] = i + 1;
			visited[i] = true;
			dfs(count + 1);
			visited[i] = false;
		}
	}
}
