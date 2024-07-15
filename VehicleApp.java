// Superclass
class Vehicle {
    String type; 
    Vehicle(String type) {
        this.type = type;
    }

    void display() {
        System.out.println("This is a " + type);
    }
}
class Car extends Vehicle {
    String modelName; 

    
    Car(String type, String modelName) {
        super(type); 
        this.modelName = modelName;
    }   
    void display() {
        super.display();
        System.out.println("Model Name: " + modelName);
    }
}

public class VehicleApp {
    public static void main(String[] args) {
        Car car = new Car("Vehicle", "Toyota Camry");
        car.display();
    }
}
