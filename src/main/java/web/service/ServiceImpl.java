package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceImpl implements Service{

    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("crutaya1","QZXW",111));
        cars.add(new Car("crutaya2","QZXW",222));
        cars.add(new Car("crutaya3","QZXW",333));
        cars.add(new Car("crutaya4","QZXW",444));
        cars.add(new Car("crutaya5","QZXW",555));
    }
    @Override
    public List<Car> geting(int count) {
            List<Car> newlist = getCars();
            return newlist.stream().limit(count).collect(Collectors.toList());
    }

    public ServiceImpl() {

    }

    public List<Car> getCars() {
        return cars;
    }
}
