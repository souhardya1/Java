public class Operators {
    public static void main(String[] args) {

        // Precedence: * > / > 
        int a =  5;
        int b =  4;

        //Arithmatic Operators
        int add = a+b;
        int minus = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;

        System.out.println("a + b = "+ add);
        System.out.println("a - b = "+ minus);
        System.out.println("a * b = "+ mul);
        System.out.println("a / b = "+ div);
        System.out.println("a % b = "+ mod);

        // Assignment Operators
        int x=3;
        x+=3;
        System.out.println("x += 3: "+ x);
        x-=3;
        System.out.println("x -= 3: "+ x);
        x*=3;
        System.out.println("x *= 3: "+ x);
        x/=3;
        System.out.println("x /= 3: "+ x);

        //Comparison Operator
        boolean check =64<4;
        System.out.println(check);

        // Logical Operator
        System.out.println(64<5 || 64>5); // Logical OR
        System.out.println(64<5 && 64>5);  // Logical AND

        //Bitwise Operator
        System.out.println("Bitwise AND");
        System.out.println(2&3);

        //   10
        //   11
        //--------
        //   10

        System.out.println("Bitwise OR");
        System.out.println(2|3);

        //   10
        //   11
        //--------
        //   11


    }


}
