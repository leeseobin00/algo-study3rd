import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 일이삼더하기_서빈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int[] arr = new int[12];
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		int[] nums = new int[t];
		int max = 0;
		for (int i = 0; i < t; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, nums[i]);
		}

		for (int i = 0; i < t; i++) {
			for (int j = 4; j <= max; j++) {
				arr[j] = arr[j-3] + arr[j-2] + arr[j-1];
			}
		}

		for (int i = 0; i < t; i++) {
			sb.append(arr[nums[i]]).append("\n");
		}

		System.out.println(sb.toString());
	}
}
