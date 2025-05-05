package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getListCars() {
        return carDao.getListCars();
    }

    @Override
    public List<Car> getSomeCars(List<Car> cars, int count) {
        return carDao.getSomeCars(cars, count);
    }
}
