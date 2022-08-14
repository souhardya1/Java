public class WhileLoop {
    public static void main(String[] args) {
        int i=0;
        while (i<5) {
            System.out.println("i = "+i);
            i++;
        }

        int j = 0;
        while (true){
            System.out.println("J = "+j);
            j=j+1;
            if (j==5){
                break;
            }
        }
    }
}
