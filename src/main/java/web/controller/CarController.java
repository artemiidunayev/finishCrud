package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarServiceImp carServiceImp;

    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

//    @GetMapping("/car")
//    public String speed(Model model) {
//        model.addAttribute("car", carServiceImp.speed());
//        return "cars/speed";


    @GetMapping("/cars")
    public String numberOfCars(@RequestParam(value = "count", defaultValue = "5") int number,
                               Model model) {
        List<Car> list = carServiceImp.speed();
        List<Car> listResult = new ArrayList();

        if (number > 0 && number <= 5) {
            for (int i = 0; i < number; i++) {
                listResult.add(list.get(i));
            }
            model.addAttribute("message2", listResult);
        }
        else if (number > 5) {
            model.addAttribute("message",list);
        }
        return "cars";
    }


}

