import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, tong;

        System.out.println("Nhập giá trị n: ");
        n = sc.nextInt();

        tong = 0;
        for(int i = 1; i <=n; i++) {
            tong += i;
        }
        System.out.println("Tổng các số từ 1 đến n là: " + tong);
    }
}