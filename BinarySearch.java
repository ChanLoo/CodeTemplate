import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), q = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        in.close();

        return;
    }

    public static boolean check(int x) {
        return true;
    }

    // 区间 [l, r] 被划分成 [l, mid] 和 [mid + 1, r] 时使用
    public static int BinarySearch1(int l, int r) {
        while (l < r) {
            int mid = l + r >> 1;
            if (check(mid)) r = mid;
            else l = mid + 1;
        }
        return l;
    }

    // 区间 [l, r] 被划分成 [l, mid - 1] 和 [mid, r] 时使用
    public static int BinarySearch2(int l, int r) {
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (check(mid)) l = mid;
            else r = mid - 1;
        }
        return r;
    }
}