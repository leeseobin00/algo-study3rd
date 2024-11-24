import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 날짜계산_서빈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int e = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int result = 1, tmpE = 1, tmpS = 1, tmpM = 1;
		while (true) {
			if (e == tmpE && s == tmpS && m == tmpM) {
				System.out.println(result);
				return;
			}
			result++;
			tmpE = (tmpE == 15) ? 1 : tmpE + 1;
			tmpS = (tmpS == 28) ? 1 : tmpS + 1;
			tmpM = (tmpM == 19) ? 1 : tmpM + 1;
		}
	}
}