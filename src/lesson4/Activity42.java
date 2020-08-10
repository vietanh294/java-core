package lesson4;

import java.util.Scanner;

public class Activity42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n:");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i+(i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
