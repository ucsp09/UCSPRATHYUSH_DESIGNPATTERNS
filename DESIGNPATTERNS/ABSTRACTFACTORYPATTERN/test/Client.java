package ABSTRACTFACTORYPATTERN.test;
import ABSTRACTFACTORYPATTERN.src.*;
public class Client{
    public static void main(String[] args)
    {
        PenFactory REYNOLDS=new ReynoldsFactory();
        Pen p1=REYNOLDS.createPen("Red");
        System.out.println("**************************");
        System.out.println(p1.getName()+" "+p1.getColor());
        System.out.println("**************************");
        Pen p2=REYNOLDS.createPen("Green");
        System.out.println("**************************");
        System.out.println(p2.getName()+" "+p2.getColor());
        System.out.println("**************************");
        PenFactory CELLO=new CelloFactory();
        Pen p3=CELLO.createPen("Blue");
        System.out.println("**************************");
        System.out.println(p3.getName()+" "+p3.getColor());
        System.out.println("**************************");
        Pen p4=CELLO.createPen("Black");
        System.out.println("**************************");
        System.out.println(p4.getName()+" "+p4.getColor());
        System.out.println("**************************");
    }
}