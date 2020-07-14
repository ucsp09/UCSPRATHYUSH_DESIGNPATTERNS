package ABSTRACTFACTORYPATTERN.src;

public class ReynoldsFactory implements PenFactory {
    @Override
    public Pen createPen(String color)
    {
        Pen p=new PinPoint();
        p.setColor(color);
        return p;
    }
}