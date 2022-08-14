public class ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int j =0 ; j<10;j++){
            if (j==7){
                continue;
            }
            else{
                System.out.println(j);
            }
        }

        for (int x=10; x>0; x--){
            System.out.println("X = "+x);
        }
        
        // print odd numbers
        for (int k=1; k < 11 ; k = k + 2){
            System.out.println("K = "+k);

        }

    }
}
