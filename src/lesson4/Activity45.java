package lesson4;


import java.util.Scanner;

public class   Activity45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n:");
        int n = scanner.nextInt();
        int g=1, i=1;

        do {
            g= g* i;
            i++;
        }
        while (i<= n);
        System.out.println(n+"! <giai thừa> bằng:" +g);




    }
}
