package FACTORYMETHODPATTERN.src;

public class Bakery {
    public Cake makeCake(String cakeType)
    {
        if(cakeType.equals("Chocolate"))
        {
            Cake cake=new ChocolateCake();
            return cake;
        }
        else if(cakeType.equals("Strawberry"))
        {
            Cake cake=new StrawberryCake();
            return cake;
        }
        else
            return null;
    }
}