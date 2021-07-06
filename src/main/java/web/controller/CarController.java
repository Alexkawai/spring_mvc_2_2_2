package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.Service;
import web.service.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    Service service = new ServiceImpl();
    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam("count") int count, ModelMap model) {
        List<Car> cars = service.geting(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
