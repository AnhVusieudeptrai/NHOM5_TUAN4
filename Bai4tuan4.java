/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai4tuan4;

import static com.mycompany.bai4tuan4.bai4.PrimeCheck.isPrime;
import java.util.Scanner;

/**
 *
 * @author My Le
 */
public class Bai4tuan4 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen can kiem tra: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " la so nguyen to.");
        } else {
            System.out.println(number + " khong phai la so nguyen to.");
        }
    }
}
