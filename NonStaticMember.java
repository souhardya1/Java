public class NonStaticMember {
    int num;
    NonStaticMember(){ // Constructor
        System.out.println("Inside the Constructor");
    }

    {   // Non static block
        System.out.println("Inside the non static block");
        System.out.println(num);
    }

    public static void main(String[] args) {
        System.out.println("Inside the main method");
        new NonStaticMember();
        new NonStaticMember();
        new NonStaticMember();
    }

    static {
        System.out.println("Inside static block");
        // Non static blocks and constructor executed everytime we create an object
        // Static blocks get executed when a class is loaded
    }
}
