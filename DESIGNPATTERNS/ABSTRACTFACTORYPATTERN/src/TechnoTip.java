package ABSTRACTFACTORYPATTERN.src;
public class TechnoTip implements Pen {
    String color;
    String name;
    public TechnoTip()
    {
        this.name="TechnoTip";
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