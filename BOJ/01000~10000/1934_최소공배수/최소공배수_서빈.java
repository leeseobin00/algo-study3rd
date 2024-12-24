import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소공배수_서빈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			int max = a * b;
			int min = 1;
			for (int j = Integer.min(a, b); j > 1; j--) {
				if (a % j == 0 && b % j == 0) {
					min = j;
					break;
				}
			}
			sb.append(max / min).append("\n");
		}
		System.out.println(sb.toString());
	}
}
