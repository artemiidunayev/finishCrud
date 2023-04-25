package web.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp  {
List <Car> cars;
    {
        cars = new ArrayList<>();

        cars.add(new Car("bmw","black",200));
        cars.add(new Car("mercedes","white",250));
        cars.add(new Car("2114","white",150));
        cars.add(new Car("lamborgini","yellow",300));
        cars.add(new Car("bugati","black",350));
    }

public List<Car> speed(){
        return cars;

    }
}
