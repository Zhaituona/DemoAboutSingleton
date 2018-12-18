package useSingleton;

public class Car {
// car is the class name , singleton just the object name .
    private static Car singleton = new Car();

    private Car(){

    }

    public static Car getInstance(){// return will be the singleton type class an object
        System.out.println("This is from getInstance method ");
        return singleton;
    }
    public void getCarBrand(){
        System.out.println("This is from car class method ");
    }
    protected static void carName(){
        System.out.println("car name");
    }
}
