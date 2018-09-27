public class Engine
{
    // instance variables - replace the example below with your own
    private int fuel;
    private int wtpl;
    private int max = 200;
    private String myEngine; 
    
    public Wheel wheel;
    
    public Engine(String myEngine,int wtpl)
    {
        // initialise instance variables
        this.wtpl=wtpl;
        this.myEngine= myEngine;
    }
    
    public void setFuel(int fuelLevel){  
        if(fuelLevel < 0 || fuelLevel > max){
            System.out.println("Error, the fuel level isn't within the usable range");        
        }
        else
        {
            this.fuel=fuelLevel;
        }
   }

   public int getFuel()
   {
       return this.fuel;
   }
   
   public int getwtpl()
   {
       return this.wtpl;
    }
}

