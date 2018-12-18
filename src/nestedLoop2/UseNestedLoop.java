package nestedLoop2;

public class UseNestedLoop {
    public static void main(String[] args) {
        for(int i =0;i< 10; i++){// outer loop open
            System.out.print("*"); //  wa can declare like this
            for(int j=0; j<i; j++){// inner loop open
                System.out.print( "*");
            }// inner loop close
            System.out.println();
        }// outer loop close
    }

}
