package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getListCars();
    List<Car> getSomeCars(List<Car> cars, int count);
}
