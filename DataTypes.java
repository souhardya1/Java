public class DataTypes {
    public static void main(String[] args) {

        //  Primitive Datatypes

        byte b = 127;                               // -(2^8) to (2^8)- 1
        short s = 4;                                // -(2^16)/2 to (2^16)/2- 1
        int i = 2;                                  // -(2^32)/2 to (2^32)/2- 1
        float f = 2.5f;                             // dependes on decimals
        long l = 21102134542l;                      // -(2^64)/2 to (2^64)/2- 1
        double d = 2.44444444444d;                  // depends on decimals
        char c = 'A';                               // 0 to (2^16) - 1
        boolean boo = true;                         // True or False

        System.out.println("Byte + Short: "+ b+s );
        System.out.println("Int + Float: "+ i+f );
        System.out.println("Long + Double: "+ l+d);
        System.out.println(b,s);

    }
}
