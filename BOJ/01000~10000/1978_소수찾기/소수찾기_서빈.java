import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수찾기_서빈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] nums = new int[n];
		int result = 0;
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
			boolean flag = true;
			for (int j = 2; j < nums[i]; j++) {
				if (nums[i] % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag && nums[i] != 1) {
				result++;
			}
		}
		System.out.println(result);
	}
}
