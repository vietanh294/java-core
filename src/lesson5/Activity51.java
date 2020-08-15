package lesson5;

import java.util.Scanner;

public class Activity51 {
    public static void main(String[] args) {
        // số armstrong là số mà : 153= 1^3+ 5^3+ 3^3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương: ");
        int n= scanner.nextInt();
        System.out.println("TÌm các số Armstrong từ 1 đến "+ n);
        int sum =0, k,b,c;
        for (int i = 0; i <= n; i++) {
            k=i;
            while (k>0) {
                b= k%10;
                sum= sum+(b*b*b);
                k=k-b;
                k=k/10;
            }
            if (sum==i)
                System.out.println(i);
            sum=0;
        }
    }
}
