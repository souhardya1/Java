public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 60*5-34/2;   // if tie precedence then left to right
        /*
            = 300 - 34/2
            = 300 - 17
            = 283
        */
        int b = 60/5-34*2;  // if tie precedence then left to right 
        /*
            = 12 - 34*2
            = 12 - 68
            = -56
        */
        System.out.println(a);
        System.out.println(b);

        /* Precedence Table:
            () [] . ->
            ! ++ -- & typecast sizeof
            * / %
            + -
            << >>
            < <= > >=
            ==  !=
            &
            ^
            |
            &&
            ||? :
            = +=
        */

    }

}
