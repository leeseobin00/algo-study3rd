import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 숨바꼭질_서빈 {
	static boolean visited[] = new boolean[100_001];
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		visited[n] = true;

		System.out.println(bfs(n, k));
	}

	public static int bfs(int n, int k) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[]{n, 0});

		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			visited[current[0]] = true;

			if (current[0] == k) {
				return current[1];
			}

			if (current[0] * 2 <= 100_000 && !visited[current[0] * 2]) {
				visited[current[0] * 2] = true;
				queue.add(new int[] {current[0] * 2, current[1]});
			}

			if (current[0] - 1 >= 0 && !visited[current[0] - 1]) {
				visited[current[0] - 1] = true;
				queue.add(new int[] {current[0] - 1, current[1] + 1});
			}

			if (current[0] + 1 <= 100_000 && !visited[current[0] + 1]) {
				visited[current[0] + 1] = true;
				queue.add(new int[] {current[0] + 1, current[1] + 1});
			}
		}
		return -1;
	}
}
