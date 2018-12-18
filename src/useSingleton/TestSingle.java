package useSingleton;

public class TestSingle {
    public static void main(String[] args) {

        Single s = Single.getInstance();
        s.methodA();
        System.out.println(Single.getInstance());



    }
}
