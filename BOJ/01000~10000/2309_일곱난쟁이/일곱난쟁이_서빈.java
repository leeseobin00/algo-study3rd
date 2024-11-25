import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 일곱난쟁이_서빈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[9];    // 9명의 난쟁이 키를 저장할 배열
		int[] fake = new int[2];    // 가짜 난쟁이의 인덱스 저장할 배열
		int sum = 0;    // 난쟁이 키의 총합을 저장할 변수

		// 난쟁이 키 입력 및 총합 계산
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());    // 나나쟁이 키 입력
			sum += arr[i];    // 키를 총합에 추가
		}
		Arrays.sort(arr);    // 난쟁이 키를 오름차순 정렬

		// 두 명의 가짜 난쟁이를 찾는 반복문
		outer:
		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - arr[i] - arr[j] == 100) {    // 두 난쟁이를 제외한 합이 100
					fake[0] = i;
					fake[1] = j;
					break outer;    // 가짜 난쟁이를 찾음
				}
			}
		}

		// 가짜 난쟁이를 제외하고 출력
		for (int i = 0; i < 9; i++) {
			if (i != fake[0] && i != fake[1]) {
				System.out.println(arr[i]);
			}
		}
	}
}
