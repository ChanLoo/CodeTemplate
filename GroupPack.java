import java.util.*;

public class GroupPack {
    static int N = 110;
    static int n, m;
    static int[][] v = new int[N][N], w = new int[N][N];
    static int[] s = new int[N];
    static int[] f = new int[N];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 1; i <= n; i++) {
            s[i] = in.nextInt();
            for (int j = 0; j < s[i]; j++) {
                v[i][j] = in.nextInt();
                w[i][j] = in.nextInt();
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= 0; j--) {
                for (int k = 0; k < s[i]; k++) {
                    if (v[i][k] <= j) f[j] = Math.max(f[j], f[j - v[i][k]] + w[i][k]);
                }
            }
        }

        System.out.println(f[m]);
    }
}