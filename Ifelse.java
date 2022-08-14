import java.util.Scanner;
public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("You can drive");
        }
        else if (age>14) {
            System.out.printf("You have to wait %d years to drive",18-age);
        }
        else {
            System.out.println("No you cannot drive");
        }
    }
}
