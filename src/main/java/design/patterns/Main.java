package design.patterns;

import design.patterns.builders.CarBuilder;
import design.patterns.builders.CarManualBuilder;
import design.patterns.cars.Car;
import design.patterns.cars.Manual;
import design.patterns.director.Director;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);
        Manual manual = carManualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + manual.print());
    }
}