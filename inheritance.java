//Parent Class
class Vehicle {
    protected String brand;

    public void start() {
        System.out.println("The vehicle starts.");
    }

    public void stop() {
        System.out.println("The vehicle stops.");
    }
}

//Child Class
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("The car starts with a key ignition.");
    }

    @Override
    public void stop() {
        System.out.println("The car stops by turning off the engine.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();

        Car car = new Car();
        car.start();      
        car.stop(); 
    }
}
