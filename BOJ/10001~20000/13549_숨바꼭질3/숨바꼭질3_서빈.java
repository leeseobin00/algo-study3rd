import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 숨바꼭질3_서빈 {
	static boolean[] visited = new boolean[100_001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		System.out.println(bfs(n, k));
	}

	public static int bfs(int n, int k) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[]{n, 0});
		visited[n] = true;

		while (!queue.isEmpty()) {
			int[] current = queue.poll();

			if (current[0] == k) {
				return current[1];
			}

			visited[current[0]] = true;

			if (2 * current[0] <= 100_000 && !visited[2 * current[0]]) {
				queue.add(new int[]{2 * current[0], current[1]});
				visited[2 * current[0]] = true;
			}

			if (current[0] - 1 >= 0 && !visited[current[0] - 1]) {
				queue.add(new int[]{current[0] - 1, current[1] + 1});
				visited[current[0] - 1] = true;
			}

			if (current[0] + 1 <= 100_000 && !visited[current[0] + 1]) {
				queue.add(new int[]{current[0] + 1, current[1] + 1});
				visited[current[0] + 1] = true;
			}
		}

		return -1;
	}
}
