import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n, r, q, kt1, kt2;
        System.out.println("Nhập hai số cần tìm UCLN và BCNN: ");
        m = sc.nextInt();
        n = sc.nextInt();
        kt1 = m;
        kt2 = n;
        while (kt2 != 0) {
            r = kt1 % kt2;
            kt1 = kt2;
            kt2 = r;
        }
        r = kt1;
        q = (m * n) / r;
        System.out.println("UCLN và BCNN lần lượt là: " + r + " va " + q + ".");
    }
}
