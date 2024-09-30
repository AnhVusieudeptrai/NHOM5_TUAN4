import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n, m, kt;

        System.out.println("Nhập số cần kiểm tra: ");
        n = sc.nextInt();
        kt = n;
        m = 0;
        while (kt > 0) {
            m = m * 10 + kt % 10;
            kt = kt / 10;
        }
        if(m == n) {
            System.out.println("Đó là số đối xứng.");
        }else {
            System.out.println("Đó không phải là số đối xứng.");
        }
    }
}