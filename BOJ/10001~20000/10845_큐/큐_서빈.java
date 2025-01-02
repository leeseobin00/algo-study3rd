import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 큐_서빈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());

		Deque<Integer> queue = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();

			switch (command) {
				case "push":
					queue.add(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					sb.append(queue.isEmpty() ? -1 : queue.pop()).append("\n");
					break;
				case "size":
					sb.append(queue.size()).append("\n");
					break;
				case "empty":
					sb.append(queue.isEmpty() ? 1 : 0).append("\n");
					break;
				case "front":
					sb.append(queue.isEmpty() ? -1 : queue.peekFirst()).append("\n");
					break;
				case "back":
					sb.append(queue.isEmpty() ? -1 : queue.peekLast()).append("\n");
					break;
				default:
					break;
			}
		}
		System.out.println(sb.toString());
	}
}
