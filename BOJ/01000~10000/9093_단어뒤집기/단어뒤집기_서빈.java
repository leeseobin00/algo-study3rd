import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_09093 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		Stack<Character> stacks = new Stack<>();

		for (int i = 0; i < n; i++) {
			char[] characters = br.readLine().toCharArray();
			for (int j = 0; j < characters.length; j++) {
				if (characters[j] == ' ') {
					// 스택에 있는 문자 뒤집어서 출력
					while (!stacks.isEmpty()) {
						sb.append(stacks.pop());
					}
					// 공백 추가
					sb.append(' ');
				} else {
					stacks.push(characters[j]);
				}
			}

			// 마지막 단어 처리
			while (!stacks.isEmpty()) {
				sb.append(stacks.pop());
			}

			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
