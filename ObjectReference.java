public class ObjectReference {
    int x=7;
    ObjectReference(){

    } // default constructor
    public static void main(String[] args) {
        ObjectReference oref = new ObjectReference();
        System.out.println(oref); // return address of object we created
        System.out.println(oref.x);
    }
}
