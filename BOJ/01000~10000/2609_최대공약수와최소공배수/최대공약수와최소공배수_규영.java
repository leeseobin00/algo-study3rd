import java.io.*;
import java.util.*;

/*
    11528KB, 64ms
 */

public class 최대공약수와최소공배수_규영 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), GCD = getGCD(a, b);
        System.out.println(GCD);
        System.out.print(a*b/GCD); // 최소공배수 구하는 법
    }
    static int getGCD(int a, int b) {
        if (a%b == 0) return b;
        return getGCD(b, a%b);
    }
}