package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Car[] cars = {
                new Car("Москвич-412", 4),
                new Car("Lamborghini", 4)
        };
        Truck[] trucks = {
                new Truck("ЗИЛ-133", 10),
                new Truck("Volvo FH16", 12)
        };
        Bicycle[] bicycles = {
                new Bicycle("Trike Bike", 3),
                new Bicycle("AGang", 2)
        };


        PrintService printService = new PrintService();
        printService.print(cars);
        printService.print(trucks);
        printService.print(bicycles);

        Car car = new Car("Волга-24", 4);
        Car car2 = new Car("Lamborghini", 4);

        car.setModelName("Волга-24");
        car2.setModelName("Porsche 911");
        car.setWheelsCount(4);
        car2.setWheelsCount(4);

        Truck truck = new Truck("ЗИЛ-133", 10);
        Truck truck2 = new Truck("Volvo FH16", 12);
        truck.setModelName("Kenworth W900");
        truck2.setModelName("КАМАЗ");
        truck.setWheelsCount(10);
        truck2.setWheelsCount(12);

        Bicycle bicycle = new Bicycle("Trike Bike", 3);
        Bicycle bicycle2 = new Bicycle("AGang", 2);

        bicycle.setModelName("Иж-Байк Фермер");
        bicycle2.setModelName("Stels");
        bicycle.setWheelsCount(3);
        bicycle2.setWheelsCount(2);

        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}
