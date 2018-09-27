public class Car
{
    private double totalDistance;
    private int fuelLevel;
    private String myCar;
    
    public Engine engine;
    public Door door;

    public Car(String myCar)
    {
        // initialise instance variables
        totalDistance = 0;
        this.myCar=myCar;

    }

    public static void main(String args[])
    {

        Car car = new Car("Mark7");
       
        Engine engine = new Engine("PL9", 9);
        car.addEngine(engine);
        
        Door door = new Door ("UP2", 4);
        car.addDoor(door);
        
        Wheel wheel = new Wheel ("Wichelin8", 8);
        car.addWheel(wheel);
        
        car.engine.setFuel(100); 
        car.drive();
        car.getDistance();
    }

    public void addEngine(Engine newEngine)
    {
        this.engine = newEngine;
    }

    public void addDoor(Door newDoor)
    {
        this.door = newDoor;
    }
    
    public void addWheel(Wheel newWheel)
    {
        this.engine.wheel = newWheel;
    }
    
    public void drive()
    {
        int turns = this.engine.getFuel()*this.engine.getwtpl();
        this.totalDistance = this.engine.wheel.distance(turns);
    }
    
    public void getDistance()
    {
        System.out.println("Distance travelled is :"+this.totalDistance);
    }
    
}