package lesson4;

public class Activity43 {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            if (i%3==0)
                System.out.print(i + " ");
        }
        System.out.println(
        );
        for (int j = 0; j < 101; j++) {
            if (j%5==0)
                System.out.print(j + " " );
        }
        System.out.println();
        for (int k = 0; k < 101; k++) {
            if (k%3==0&k%5==0) System.out.print(k + " ");
        }
        System.out.println();
    }

}
