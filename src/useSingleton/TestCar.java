package useSingleton;

public class TestCar {
    public static void main(String[] args) {


        Car car1 = Car.getInstance();// reference same object . only one object at a time
        Car car2 = Car.getInstance();
        // can call the private constructor , reference to the same object
        car1.hashCode();
        car2.hashCode();
        car2.getCarBrand();
        Car.carName();


        if(car1.equals(car2)){
            System.out.println("They are same object");
        }
        else{
            System.out.println("They are not same object");
        }
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        car1.getCarBrand();

    }
}