import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼_서빈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] factorial = new int[n + 1];
		factorial[0] = 1;
		for (int i = 1; i < n + 1; i++) {
			factorial[i] = factorial[i - 1] * i;
		}
 		System.out.println(factorial[n]);
	}
}
