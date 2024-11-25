import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N과M5_서빈 {
	static int n, m;
	static int result[];
	static int arr[];
	static boolean visited[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		arr = new int[n];
		result = new int[n];
		visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

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
			result[count] = arr[i];
			visited[i] = true;
			dfs(count + 1);
			visited[i] = false;
		}
	}
}
