import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), q = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        while (q-- != 0) {
            int x = in.nextInt();
            System.out.print(BinarySearch1(0, n - 1) + " " + BinarySearch2(0, n - 1));
        }
        in.close();

        return;
    }

    public static boolean check(int x) {
        return true;
    }

    public static int BinarySearch1(int l, int r) {
        while (l < r) {
            int mid = l + r >> 1;
            if (check(mid)) r = mid;
            else l = mid + 1;
        }
        return l;
    }

    public static int BinarySearch2(int l, int r) {
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (check(mid)) l = mid;
            else r = mid - 1;
        }
        return r;
    }
}