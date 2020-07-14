package PROTOTYPEPATTERN.test;
import PROTOTYPEPATTERN.src.*;
public class Client {
    public static void main(String[] args)
    {
        Tree t1=new Tree();
        Node n1=t1.getNode("Leaf");
        n1.setChildren();
        System.out.println("*************************************");
        System.out.println(n1.getChildren());
        System.out.println("*************************************");
        Node n2=t1.getNode("Partial");
        n2.setChildren();
        System.out.println("*************************************");
        System.out.println(n2.getChildren());
        System.out.println("*************************************");
        Node n3=t1.getNode("Full");
        n3.setChildren();
        System.out.println("*************************************");
        System.out.println(n3.getChildren());
        System.out.println("*************************************");
    }
}