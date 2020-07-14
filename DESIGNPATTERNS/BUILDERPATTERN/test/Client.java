package BUILDERPATTERN.test;
import BUILDERPATTERN.src.*;

public class Client {
    public static void main(String[] args)
    {
        CarCompany HYUNDAI =new CarCompany();
        CarBuilder FERRARIBUILDER=new FerrariCarBuilder();
        HYUNDAI.constructCar(FERRARIBUILDER);
        Car FERRARI=FERRARIBUILDER.getCar();
        System.out.println("**************************");
        System.out.println(FERRARI.getColor()+" "+FERRARI.getWheels()+" "+FERRARI.getEngine());
        System.out.println("**************************");
        CarCompany VOLKSWAGEN =new CarCompany();
        CarBuilder MERCEDESBUILDER=new MercedesCarBuilder();
        VOLKSWAGEN.constructCar(MERCEDESBUILDER);
        Car MERCEDES=MERCEDESBUILDER.getCar();
        System.out.println("**************************");
        System.out.println(MERCEDES.getColor()+" "+MERCEDES.getWheels()+" "+MERCEDES.getEngine());
        System.out.println("**************************");
    }
}