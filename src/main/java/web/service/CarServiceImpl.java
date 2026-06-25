package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.dao.CarDAOImpl;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    CarDAO carDAO = new CarDAOImpl();

    public List<Car> index (int count) {
return carDAO.index(count);
    }
}
