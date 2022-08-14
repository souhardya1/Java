public class ThisKeyword {
    int x=7;
    ThisKeyword(){
        System.out.println(this);
        System.out.println(this.x);
        // this can only be used in non static context
    }
    public static void main(String[] args) {
        new ThisKeyword();
        new ThisKeyword();
    }
}
