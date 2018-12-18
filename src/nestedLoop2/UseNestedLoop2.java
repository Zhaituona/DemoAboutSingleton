package nestedLoop2;

public class UseNestedLoop2 {
    public static void main(String[] args) {

        for(int i =0; i< 10; i++){
            System.out.print(i);
            int j = 0;
            while(j< i){
                System.out.print(" $");
                j++;

            }
            System.out.println();
        }
    }
}
