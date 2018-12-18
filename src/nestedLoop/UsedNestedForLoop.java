package nestedLoop;

public class UsedNestedForLoop {
    public static void main(String[] args) {
        for(int i =0; i<=5; i++){
            System.out.print(i+ "*******");
            for(int k =1; k< 3; k++){
                System.out.print(k);
                System.out.print("a" + " ");
            }
            System.out.println();
        }
    }
}
