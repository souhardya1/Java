public class StaticMethodDemo {

    static int num; // int default value = 0

    public static void main(String[] args){
        System.out.println("Inside Main Method");
        StaticMethodDemo.method();
        System.out.println(StaticMethodDemo.num);
   }
    static void method(){
        System.out.println("Inside Static Method");
    }
    static{
        System.out.println("Inside Static Block");
        StaticMethodDemo.method();
    }
}
