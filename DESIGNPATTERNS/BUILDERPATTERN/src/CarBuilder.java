package BUILDERPATTERN.src;

public interface CarBuilder {
    void buildWheels();
    void paintColor();
    void buildEngine();
    Car getCar();
}