package com.kodilla.biuro;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private String brand;
    private String model;
    private Integer yearOfProduction;
    private Boolean isAvailable;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                Objects.equals(yearOfProduction, car.yearOfProduction) &&
                Objects.equals(isAvailable, car.isAvailable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfProduction, isAvailable);
    }
}
