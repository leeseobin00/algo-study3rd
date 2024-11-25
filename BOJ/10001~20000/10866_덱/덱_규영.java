import java.io.*;
import java.util.*;

/*
    16168KB 120ms
 */

public class 덱_규영 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Deque<Integer> dq = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        while (N-->0) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "push_front":
                    dq.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    dq.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(dq.isEmpty() ? -1 : dq.poll()).append('\n');
                    break;
                case "pop_back":
                    sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append('\n');
                    break;
                case "size":
                    sb.append(dq.size()).append('\n');
                    break;
                case "empty":
                    sb.append(dq.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "front":
                    sb.append(dq.isEmpty() ? -1 : dq.peek()).append('\n');
                    break;
                case "back":
                    sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append('\n');
                    break;
            }
        }
        System.out.print(sb);
    }
}