package ru.skypro;

public class Truck extends Vehicle{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine(Truck truck) {
        System.out.println("Проверяем двигатель " + truck.getModelName());
    }

    public void checkTrailer(Truck truck) {
        System.out.println("Проверяем прицеп " + truck.getModelName());
    }
}
