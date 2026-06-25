package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;

@Component
public class CarService {
    CarDAO carDAO = new CarDAO();

    public List<Car> index (int count) {
return carDAO.index(count);
    }
}
