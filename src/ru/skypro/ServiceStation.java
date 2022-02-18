package ru.skypro;

public class ServiceStation {

    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
            }
            car.updateTyre(car);
            car.checkEngine(car);
            System.out.println();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
            }
            truck.updateTyre(truck);
            truck.checkEngine(truck);
            truck.checkTrailer(truck);
            System.out.println();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            }
            bicycle.updateTyre(bicycle);
            System.out.println();
        }
        System.out.println();
    }
}
