public class Wheel
{
    // instance variables - replace the example below with your own
    private int radius;
    public String myWheel;
    
    public Wheel(String myWheel,int rd)
    {
        // initialise instance variables
        radius = rd;
        this.myWheel= myWheel;
    }
    
    public double distance(int revs)
    {
        double circumference = 2*Math.PI*this.radius;
        return circumference*revs;
    }
}
