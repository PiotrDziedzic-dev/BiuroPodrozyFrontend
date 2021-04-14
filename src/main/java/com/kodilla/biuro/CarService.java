package com.kodilla.biuro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarService {

    private BackendClient backendClient;

    private List<Car> cars;
    private static CarService carService;

    private CarService() {
        this.cars = getCarsFromDataBase();
    }

    public List getCars() {

        return new ArrayList(cars);
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public List findByBrand(String brand) {

    }

    private List getCarsFromDataBase() {
       cars = backendClient.getAllCars();
       return cars;
    }
}
