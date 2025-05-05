package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Dodge", "Black", 1998));
        cars.add(new Car("BMW", "Gray", 2002));
        cars.add(new Car("Ford", "Red", 1996));
        cars.add(new Car("Nissan", "White", 2005));
        cars.add(new Car("Lexus", "Yellow", 2009));
    }


    @Override
    public List<Car> getListCars() {
        return cars;
    }

    @Override
    public List<Car> getSomeCars(List<Car> cars, int count) {
        if (count == 0 || count > 5) return cars;
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
