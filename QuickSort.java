import java.util.Scanner;

public class QuickSort {
    /*
    input:
    5
    3 1 2 4 5
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] q = new int[n];
        for (int i = 0; i < n; i++){
            q[i] = in.nextInt();
        }
        in.close();

        quickSort(q, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(q[i] + " ");
        }
    }

    public static void quickSort(int[] q, int l, int r) {
        if (l >= r) return;

        int i = l - 1, j = r + 1, x = q[l + r >> 1];
        int temp = 0;
        while (i < j) {
            do i++; while (q[i] < x);
            do j--; while (q[j] > x);
            if (i < j) {
                temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }
        quickSort(q, l, j);
        quickSort(q, j + 1, r);
    }
}