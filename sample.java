import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class sample {
    public static void main(String[] args) {
        int maths=56;
        int physics=71;
        int chemistry=46;
        if (maths>=35 | physics>=35 | chemistry>=35) {
            int total=maths+physics+chemistry;
            if (total<=59){
                System.out.println("C");
            }
            else if (total<=69) {
                System.out.println("B");
            }
            else{
                System.out.println("A");
            }
        }
        else{
            System.out.println("Result is FAIL");
        }
    }
}
