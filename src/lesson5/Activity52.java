package lesson5;

import java.awt.font.FontRenderContext;

public class Activity52 {
    public static void main(String[] args) {
        int[] number = {15,5,5,1,2,1,9,5,8,15,16};
        String uniqueNumber = "";
        for (int i : number) {
            String Str = "#"+i +"#";
            if(!uniqueNumber.contains(Str)){
                System.out.print(i +" " );
                uniqueNumber =uniqueNumber+"#"+i+"#";

            }
        }        
    }
}
