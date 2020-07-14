package PROTOTYPEPATTERN.src;

public abstract class Node implements Cloneable {
    protected int children;
    public abstract void setChildren();
    @Override
    public Object clone()
    {
        Object clone=null;
        try{
            clone=super.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
    public int getChildren()
    {
        return children;
    }
}