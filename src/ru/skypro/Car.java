package ru.skypro;

public class Car extends Vehicle{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

   public void checkEngine(Car car) {
        System.out.println("Проверяем двигатель на модели " + car.getModelName());
    }
}
