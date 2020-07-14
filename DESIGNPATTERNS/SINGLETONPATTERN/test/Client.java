package SINGLETONPATTERN.test;

import SINGLETONPATTERN.src.*;

public class Client {
    public static void main(String[] args)
    {
        India in=India.getIndia();
        System.out.println(in.getPopulation());
    }    
}