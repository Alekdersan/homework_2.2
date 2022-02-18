package ru.skypro;

import java.util.Objects;

public class Vehicle {

    private  String modelName;
    private  int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return wheelsCount == vehicle.wheelsCount && Objects.equals(modelName, vehicle.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Транспортное средство " +
                "модель " + modelName +
                ", количество покрышек " + wheelsCount;
    }

    public void updateTyre(Vehicle vehicle) {
        System.out.println("Меняем покрышку на модели " + vehicle.getModelName());
    }
}
