import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Integer Input");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int sum = i+j;
        System.out.println("i + j = "+  sum);

        System.out.println("Float Input");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float sumF = a+ b;
        System.out.println("a + b = "+ sumF);

        //This is a dummy Scanner because
        String o = sc.nextLine();
        /* When nextInt() or nextFloat() method is used to read value of the input, it returns the value to the variable as expected. But the cursor, after reading the value, remains just after it. So nextLine reads the blank space character.
        Thats why we read the blank space character with a dummy scanner.
        */

        System.out.println("String Input");
        String s = sc.nextLine();

        System.out.println("String is: "+ s);


    }
}
