package nestedLoop;

public class NestedForWhileLoop {
    public static void main(String[] args) {

        for(int i =0; i< 10; i++){
            System.out.print( i + "____");
            int n = 1;
            while(n <8){
                System.out.print(n);
                n++;
            }
            System.out.println();
        }
    }
}
