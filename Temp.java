import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), q = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        while (q-- != 0) {
            int x = in.nextInt();
            System.out.print(BinarySearch1(arr, 0, n - 1, x) + " " + BinarySearch2(arr, 0, n - 1, x));
            System.out.println();
        }
        in.close();

        return;
    }

    public static int BinarySearch1(int[] q, int l, int r, int x) {
        while (l < r) {
            int mid = l + r >> 1;
            if (q[mid] >= x) r = mid;
            else l = mid + 1;
        }
        if (q[l] != x) return -1;
        return l;
    }

    public static int BinarySearch2(int[] q, int l, int r, int x) {
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (q[mid] <= x) l = mid;
            else r = mid - 1;
        }
        if (q[r] != x) return -1;
        return r;
    }
}