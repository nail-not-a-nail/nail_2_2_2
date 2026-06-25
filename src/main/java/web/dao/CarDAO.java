package web.dao;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDAO {
    private static int PEOPLE_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++PEOPLE_COUNT, "Lexus", 2021));
        cars.add(new Car(++PEOPLE_COUNT, "BMW", 2022));
        cars.add(new Car(++PEOPLE_COUNT, "Ford", 2023));
        cars.add(new Car(++PEOPLE_COUNT, "Lada", 2024));
        cars.add(new Car(++PEOPLE_COUNT, "Geely", 2025));
    }

    public List<Car> index(int count) {

        if (count >= 5) {
            return cars;
        } else {
            return cars.stream()
                    .limit(count)
                    .collect(Collectors.toList());
        }
    }

}
