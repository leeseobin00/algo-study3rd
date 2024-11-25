import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M2_서빈 {
	static int n, m;
	static int result[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		result = new int[m];
		dfs(0, 0);
		System.out.println(sb.toString());
	}

	public static void dfs(int depth, int count) {
		if (depth > n) {
			return;
		}

		if (count == m) {
			for (int i = 0; i < m; i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		result[count] = depth + 1;
		dfs(depth + 1, count + 1);
		dfs(depth + 1, count);
	}
}
