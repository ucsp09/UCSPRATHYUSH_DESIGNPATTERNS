package BUILDERPATTERN.src;

public class Car {
    private String wheels;
    private String color;
    private String engine;
    public void setWheels(String wheels)
    {
        this.wheels=wheels;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public void setEngine(String engine)
    {
        this.engine=engine;
    }
    public String getWheels()
    {
        return this.wheels;
    }
    public String getColor()
    {
        return this.color;
    }
    public String getEngine()
    {
        return this.engine;
    }
}