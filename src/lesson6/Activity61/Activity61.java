package lesson6.Activity61;

import java.util.Scanner;

public class Activity61 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập chiều dài:" );
        int width =scanner.nextInt();
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Nhập chiều cao:");
        int height =scanner1.nextInt();

        Rectangle rectangle=new Rectangle(width,height);
        System.out.println("Chu vi của hình là:"+rectangle.tinhChuvi());
        System.out.println("Diện tích của hình là:"+rectangle.tinhDientich());
        rectangle.print();
        boolean checkhinhvuong= rectangle.checkHinhvuong();
        if (checkhinhvuong==true){
            System.out.println("Đây là hình vuông");
        }else {
            System.out.println("Đây là hình chữ nhật");
        }

     }

}
