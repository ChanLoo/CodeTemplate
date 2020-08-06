import java.util.Scanner;

public class QuickSort {
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        int[] arr = new int[num];
        String[] strArr = in.nextLine().split(" ");
        for (int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }

        quickSort(arr, 0, num - 1);

        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
        in.close();
    }
}