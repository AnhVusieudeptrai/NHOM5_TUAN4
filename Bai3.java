import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n, gt;
        System.out.println("Nhập sô nguyên dương cần tính giai thừa: ");
        n = sc.nextInt();
        gt = 1;
        for(int i = 1; i <= n; i++) {
            gt *= i;
        }
        System.out.println("Giai thừa của " + n + " bằng: " + gt);
    }
}
