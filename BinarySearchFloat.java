import java.util.Scanner;

public class BinarySearchFloat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextInt();
        double l = 0, r = x;

        while (r - l > 1e-6) {
            double mid = (l + r) / 2;
            if (mid * mid >= x) r = mid;
            else l = mid;
        }

        System.out.print(l);
        return;
        
    }
}