import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색_서빈 {
	static int n, m;
	static int[][] maze;
	static int[] mx = {-1, 1, 0, 0};
	static int[] my = {0, 0, -1, 1};
	static int result = Integer.MAX_VALUE;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		maze = new int[n][m];
		visited = new boolean[n][m];
		visited[0][0] = true;

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				maze[i][j] = str.charAt(j) - '0';
			}
		}

		bfs(0, 0);
		System.out.println(maze[n-1][m-1]);
	}

	public static void bfs(int x, int y) {
		Queue<Point> queue = new LinkedList<>();
		queue.add(new Point(x, y));

		while (!queue.isEmpty()) {
			Point current = queue.poll();

			for (int i = 0; i < 4; i++) {
				int dx = current.x + mx[i];
				int dy = current.y + my[i];

				if (check(dx, dy) && !visited[dx][dy] && maze[dx][dy] > 0) {
					queue.add(new Point(dx, dy));
					maze[dx][dy] = maze[current.x][current.y] + 1;
					visited[dx][dy] = true;
				}
			}
		}

	}

	public static boolean check(int x, int y) {
		if (x < 0 || y < 0 || x > n - 1 || y > m - 1) {
			return false;
		}
		return true;
	}
}
