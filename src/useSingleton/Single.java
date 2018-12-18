package useSingleton;

public class Single {

    private static Single a = new Single();


    private Single(){

    }

    public static Single getInstance(){
        System.out.println("This is from static method");
        return a;
    }
    public void methodA(){
        System.out.println("This is method A");
    }
}
