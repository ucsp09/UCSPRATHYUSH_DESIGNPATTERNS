package FACTORYMETHODPATTERN.test;
import FACTORYMETHODPATTERN.src.*;
public class Client {
    public static void main(String[] args)
    {
        Bakery b1=new Bakery();
        Cake c1=b1.makeCake("Chocolate");
        System.out.println("***********************");
        System.out.println(c1.getPrice());
        Cake c2=b1.makeCake("Strawberry");
        System.out.println("***********************");
        System.out.println(c2.getPrice());
        System.out.println("***********************");
    }
}