import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수구하기_서빈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		boolean[] isPrime = new boolean[n + 1];

		for (int i = 2; i <= n; i++) {
			isPrime[i] = true;
		}

		for (int i = 2; i < n; i++) {
			int mul = 2;
			while (mul * i <= n) {
				isPrime[mul++ * i] = false;
			}
		}

		for (int i = m; i <= n; i++) {
			if (isPrime[i])
				System.out.println(i);
		}
	}
}
