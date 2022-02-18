package ru.skypro;

public class PrintService {

    public void print(Car[] cars) {
        System.out.println("Размер списка " + cars.length);
        for (int i = 0; i < cars.length; i++) {
            Car vehicle = cars[i];
            System.out.println(" model " + vehicle.getModelName() + ", wheels " + vehicle.getWheelsCount());
        }
        System.out.println();
    }

    public void print(Truck[] trucks) {
        System.out.println("Размер списка " + trucks.length);
        for (int i = 0; i < trucks.length; i++) {
            Truck vehicle = trucks[i];
            System.out.println(" model " + vehicle.getModelName() + ", wheels " + vehicle.getWheelsCount());
        }
        System.out.println();
    }

    public void print(Bicycle[] bicycles) {
        System.out.println("Размер списка " + bicycles.length);
        for (int i = 0; i < bicycles.length; i++) {
            Bicycle vehicle = bicycles[i];
            System.out.println(" model " + vehicle.getModelName() + ", wheels " + vehicle.getWheelsCount());
        }
        System.out.println();
    }

    public void print(Vehicle[] vehicles) {
        System.out.println("Размер списка " + vehicles.length);
        for (int i = 0; i < vehicles.length; i++) {
            Vehicle vehicle = vehicles[i];
            System.out.println("Модель " + vehicle.getModelName() + ", количество покрышек " + vehicle.getWheelsCount());
        }
        System.out.println();
    }
}
