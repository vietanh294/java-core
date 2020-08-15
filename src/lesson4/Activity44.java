package lesson4;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class Activity44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n:" );
        int k = 0,n = scanner.nextInt();
        float tbc;
        for (int i = 0; i < n + 1; i++) {
            k += i;
        }
        System.out.println("Tong từ 1 đên"+ n+ "là:"+ k);
        tbc = k/n;
        System.out.println("Trung binh cong la:"+ tbc);
        int a =0 , sum =0;
        do {
            sum += a;
            a++;
        }
        while (a<=n);
        System.out.println("tong:" + sum);
        System.out.println("tbc:"+ sum/n);
    }
}
