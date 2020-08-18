import java.util.*;

public class MultiplePack {
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     int N = in.nextInt();
    //     int V = in.nextInt();
    //     int v[] = new int[N + 1];
    //     int w[] = new int[N + 1];
    //     int s[] = new int[N + 1];

    //     for (int i = 1; i <= N; i++) {
    //         v[i] = in.nextInt();
    //         w[i] = in.nextInt();
    //         s[i] = in.nextInt();
    //     }
    //     in.close();

    //     int[][] f = new int[N + 1][V + 1];
    //     for (int i = 1; i <= N; i++) {
    //         for (int j = 0; j <= V; j++) {
    //             for (int k = 0; k <= s[i] && k * v[i] <= j; k++) {
    //                 f[i][j] = Math.max(f[i][j], f[i - 1][j - k * v[i]] + k * w[i]);
    //             }
    //         }
    //     }

    //     System.out.println(f[N][V]);
    // }

    static int N = 2010, V = 12000;//2000是体积，12000是分解后的物品的个数
    static int f[] = new int[N];
    static int v[] = new int[V];
    static int w[] = new int[V];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            int a = in.nextInt(), b = in.nextInt(), s = in.nextInt();
            int k = 1;
            while (k <= s) {
                cnt++;
                v[cnt] = a * k;
                w[cnt] = b * k;
                s -= k;
                k *= 2;
            }
            if (s > 0) {
                cnt++;
                v[cnt] = a * s;
                w[cnt] = b * s;
            }
        }

        n = cnt;
        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= v[i]; j--) {
                f[j] = Math.max(f[j], f[j - v[i]] + w[i]);
            }
        }

        System.out.println(f[m]);
    }

    
}