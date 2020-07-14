package BUILDERPATTERN.src;

public class CarCompany {
    private CarBuilder obj;
    public void constructCar(CarBuilder obj)
    {
        this.obj=obj;
        this.obj.buildWheels();
        this.obj.paintColor();
        this.obj.buildEngine();
    }
}