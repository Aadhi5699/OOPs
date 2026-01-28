public class CarService{
    //Composition instead of inheritance
    private final Engine engine; 
    public CarService(){
        this.engine = new Engine();
    }

    public void startCar(){
        engine.ignite();
        System.out.println("Car service started the car");
    }
}