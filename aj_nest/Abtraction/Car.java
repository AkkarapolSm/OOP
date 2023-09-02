package aj_nest.Abtraction;

abstract class Car {

    Car(){ // constructor
        System.out.println("Car is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("Gear Changed");
    }
}
// creating a child class whith inherite Abstract class
class Toyota extends Car {
    @Override
    void run() {
        System.out.println("Running safety");
    }
}
