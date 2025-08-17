
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int mod = 1000000007;
        long[] dp = new long[sum + 1];
        dp[0] = 1;
        for (int i = 1; i <= sum; i++) {
            for (int x : arr) {
                if (x <= i) {
                    dp[i] += (dp[i - x]) %= mod;
                }
            }
        }
        //printing test1
        System.out.println(dp[sum]);

    }
}
