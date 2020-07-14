package ABSTRACTFACTORYPATTERN.src;

public class CelloFactory implements PenFactory {
    @Override
    public Pen createPen(String color)
    {
        Pen p=new TechnoTip();
        p.setColor(color);
        return p;
    }
}