import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1 ~ 9 : 1
 * 10 ~ 99 : 2
 * 9 : 1 * 9
 * ------------------
 * 10 : 1 * 9 + 2 * 1
 * 11 : 1 * 9 + 2 * 2
 * 12 : 1 * 9 + 2 * 3
 * 13 : 1 * 9 + 2 * 4
 * ------------------
 * 100 : 1 * 9 + 2 * 90
 * 105 : 1 * 9 + 2 * 90 + 3 * (105 - 100 + 1)
 * 1000 : 1 * 9 + 2 * 90 + 3 * 900
 */
public class 수이어쓰기1_서빈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		long result = 0;

		// 자리수 구하기
		int digit = String.valueOf(n).length();
		for (int i = 1; i < digit; i++) {
			result = (long)(result + i * 9 * Math.pow(10, i - 1));
		}
		result = (long)(result + digit * (n - Math.pow(10, digit - 1) + 1));

		System.out.println(result);
	}
}
