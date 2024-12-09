import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class 괄호_서빈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			Deque<Character> deque = new ArrayDeque<>();
			char[] chars = br.readLine().toCharArray();
			Boolean flag = true;

			for (int j = 0; j < chars.length && flag; j++) {
				if (chars[j] == '(') {
					deque.addLast('(');
				} else {
					if (deque.isEmpty() || deque.peekLast() == ')') {
						flag = false;
					} else {
						deque.pollLast();
					}
				}
			}
			sb.append(flag && deque.isEmpty() ? "YES" : "NO").append("\n");
		}
		System.out.println(sb.toString());
	}
}
