public class StaticMethodReference {
    static StaticMethodReference x = new StaticMethodReference();
    static{
        System.out.println("Inside Static block");
        System.out.println(StaticMethodReference.x);
        StaticMethodReference.x = StaticMethodReference.method();
    }
    public static void main(String[] args) {
        System.out.println("Inside main");
        System.out.println(StaticMethodReference.x);
    }
    static StaticMethodReference method(){
        System.out.println("Inside static method");
        return new StaticMethodReference();
    }
}
