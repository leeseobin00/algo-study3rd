import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    11512KB, 68ms
 */

public class 잃어버린괄호_규영 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("-"), firstVal = input[0].split("\\+");
        int ans = 0;
        for (String s : firstVal) ans += Integer.parseInt(s);
        for (int i = 1; i < input.length; i++) {
            String[] nums = input[i].split("\\+");
            for (String s : nums) ans -= Integer.parseInt(s);
        }
        System.out.print(ans);
    }
}