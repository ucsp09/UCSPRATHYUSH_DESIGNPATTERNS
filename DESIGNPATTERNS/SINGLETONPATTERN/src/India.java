package SINGLETONPATTERN.src;

public class India {
    private volatile static India obj;
    private India(){}
    public static India getIndia()
    {
        if(obj==null)
        {
            synchronized (India.class)
            {
                if(obj==null)
                    obj=new India();
            }
        }
        return obj;
    }
    public long getPopulation()
    {
        return 120000000;
    }   
}