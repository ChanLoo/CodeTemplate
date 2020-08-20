import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int q[], int l, int r) {
        if (l >= r) return;

        int mid = l + r >> 1;
        mergeSort(q, l, mid);
        mergeSort(q, mid + 1, r);

        int[] tem = new int[r - l + 1];
        int k = 0, i = l, j = mid + 1;
        while (i <= mid && j <= r) {
            if (q[i] <= q[j]) tem[k++] = q[i++];
            else tem[k++] = q[j++];
        }

        while (i <= mid) tem[k++] = q[i++];
        while (j <= r) tem[k++] = q[j++];

        for (i = l, j = 0; i <= r; i++, j++) q[i] = tem[j];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = in.nextInt();
        }
        in.close();

        mergeSort(q, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(q[i] + " ");
        }
    }
}