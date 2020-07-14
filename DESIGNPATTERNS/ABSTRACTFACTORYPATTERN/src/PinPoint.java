package ABSTRACTFACTORYPATTERN.src;

public class PinPoint implements Pen{
    String color;
    String name;
    public PinPoint()
    {
        this.name="PinPoint";
    }
    @Override
    public void setColor(String color)
    {
        this.color=color;
    }
    @Override
    public String getColor()
    {
        return this.color;
    }
    @Override
    public String getName()
    {
        return this.name;
    }
}