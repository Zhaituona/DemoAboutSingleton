package nestedLoop;

public class UseNestedForLoop {

    public static void main(String[] args) {

        for(int i=0; i< 10; i++){
            System.out.print(i+  "-----");
            for(int k = 1; k <4 ; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
