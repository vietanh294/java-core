package lesson6.Activity61;

public class Rectangle {
    private  int width;
    private  int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int  tinhChuvi(){
        int chuvi= (width+height)*2;
        return chuvi;
    }
    public int  tinhDientich(){
        int Dientich= width*height;
        return Dientich;
    }
    public void print(){
        System.out.println("Chiều dài:"+ width);
        System.out.println("Chiều rộng:"+height);

    }
    public boolean checkHinhvuong() {
        if (width == height) {
            return true;
        } else {
            return false;
        }

    }
}
