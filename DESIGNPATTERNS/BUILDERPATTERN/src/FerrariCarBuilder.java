package BUILDERPATTERN.src;

public class FerrariCarBuilder implements CarBuilder {
    private Car car;
    public FerrariCarBuilder()
    {
        car=new Car();
    }
    @Override
    public void buildWheels()
    {
        car.setWheels("Burst");
    }   
    @Override
    public void paintColor() 
    {
        car.setColor("Red");
    }
    @Override
    public void buildEngine()
    {
        car.setEngine("GT486");
    }
    @Override
    public Car getCar()
    {
        return car;
    }
}