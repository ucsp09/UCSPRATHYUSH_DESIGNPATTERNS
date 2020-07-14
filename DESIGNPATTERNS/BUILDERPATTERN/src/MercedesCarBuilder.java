package BUILDERPATTERN.src;

public class MercedesCarBuilder implements CarBuilder {
    private Car car;
    public MercedesCarBuilder()
    {
        car=new Car();
    }
    @Override
    public void buildWheels()
    {
        car.setWheels("Flat");
    }   
    @Override
    public void paintColor() 
    {
        car.setColor("Grey");
    }
    @Override
    public void buildEngine()
    {
        car.setEngine("AF89C2");
    }
    @Override
    public Car getCar()
    {
        return car;
    }
}