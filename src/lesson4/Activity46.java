package lesson4;

import java.util.Scanner;

public class Activity46 {
    public static void main(String[] args) {
        // Khai báo biến và input.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương:");
        int m = scanner.nextInt();
        int k=0;
        String x="";// khai báo x là string
        // chạy vòng lặp để chuyển thập phân sang nhị phân
        do {
            k= m%2; // Lấy phần dư của m chia 2
            m-=k   ; // lấy m  trừ k
            m/=2; // lấy (m -k) chia 2
            x= k+""+x   ; // Gán phần dư vào x để dc số nhị phân
        } while (m>0);
        System.out.print("Số nhị phân cần tìm là:   ");
        System.out.println(x);

    }
}
