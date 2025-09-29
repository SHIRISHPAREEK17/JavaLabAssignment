class Engine{
    String type;
    Engine(String type){
        this.type=type;
    }
    void start(){
         System.out.println("You start the " + this.type + " engine");
    }
}
class Car{
    String model;
    int year;
    Engine engine;
    Car(String model,int year,String engineType){
        this.model=model;
        this.year=year;
        this.engine=new Engine(engineType);
    }
    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }
}
public class Composition {
    public static void main(String args[]){
        Car car = new Car("Honda", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();

    }
}
