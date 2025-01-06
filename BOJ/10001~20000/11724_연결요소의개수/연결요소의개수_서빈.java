import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연결요소의개수_서빈 {
	static int[][] graph;
	static boolean[] visited;
	static int n, m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		graph = new int[n + 1][n + 1];
		visited = new boolean[n + 1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			graph[a][b] = graph[b][a] = 1;
		}

		int result = 0;
		for (int i = 1; i <= n; i++) {
			if (visited[i] == false) {
				dfs(i);
				result++;
			}
		}
		System.out.println(result);
	}

	public static void dfs(int index) {
		if (visited[index]) {
			return;
		}
		visited[index] = true;
		for (int i = 1; i <= n; i++) {
			if (graph[i][index] == 1) {
				dfs(i);
			}
		}
	}
}
