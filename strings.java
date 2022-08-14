public class strings {
    public static void main(String[] args){
        int a=6;
        float b= 2.75f;

        // can be created in two ways
        String name = new String("Souhardya");
        String name2 = "     Souhardya Chakraborty    ";
        String name3 = "souhardya";

        System.out.print("The name is: ");
        System.out.println(name);
        System.out.printf("Value of a is: %d, value of b is: %f and name2 is %s",a,b,name2);
        System.out.println();

        // Methods
        System.out.println("Length of name is: "+name.length());

        String lname = name.toLowerCase();
        System.out.println("Lower case name is: "+lname);

        String uname = name.toUpperCase();
        System.out.println("Upper case name is: "+uname);

        String trimmedname2 = name2.trim();
        System.out.println("No space name2 is : "+trimmedname2);

        String substr = name.substring(2,5);
        System.out.println("Sub string of name is: "+substr);

        String rep = name.replace("a","popo");
        System.out.println("Replaced a in name with x: "+rep);

        System.out.println("Does it start with S? "+name.startsWith("s")); // case sensitive
        System.out.println("Does it end with a? "+name.endsWith("a"));  // case sensitive

        System.out.println("Character at 1 in name is: "+name.charAt(1));

        System.out.println("Index of first a in name is: "+name.indexOf("a")); // returns -1 if not found
        System.out.println("Index of first har in name is: "+name.indexOf("har"));// returns -1 if not found
        System.out.println("Index of last a in name is: "+name.lastIndexOf("a"));;

        System.out.println("Is name and name2 same? "+name.equals(name2));
        System.out.println("Is name and name3 same? "+name.equalsIgnoreCase(name3));

   }
}
