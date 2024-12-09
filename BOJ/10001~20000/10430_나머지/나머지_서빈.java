import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Baekjoon
 * 10430 나머지
 *
 * A B C 입력 받음
 * 1. (A+B)%C
 * 2. ((A%C) + (B%C))%C
 * 3. (A×B)%C
 * 4. ((A%C) × (B%C))%C
 */
public class 나머지_서빈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		sb.append((a + b) % c).append("\n");
		sb.append(((a % c) + (b % c)) % c).append("\n");
		sb.append((a * b) % c).append("\n");
		sb.append(((a % c) * (b % c)) % c).append("\n");
		System.out.println(sb.toString());
	}
}
