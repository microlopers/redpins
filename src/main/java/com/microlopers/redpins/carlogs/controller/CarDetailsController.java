package com.microlopers.redpins.carlogs.controller;

import com.microlopers.redpins.carlogs.persistence.entity.Car;
import com.microlopers.redpins.carlogs.entity.CarDetails;
import com.microlopers.redpins.carlogs.persistence.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "https://localhost:3000")
@RestController
public class CarDetailsController {

    @Autowired
    CarRepository repository;

    @GetMapping("/cardetails")
    public CarDetails getCarDetails(@RequestParam(value = "id", defaultValue = "0") int id) {
        return new CarDetails(0,"not defined");
    }

    @GetMapping("/bulkcreate")
    public String bulkCreate() {
        repository.save(new Car("plate1", "ford", "white"));
        repository.saveAll(Arrays.asList(new Car("plate2", "ford", "blue"),
                new Car("plate3", "opel", "blue"),
                new Car("plate4", "opel", "red")));
        return "Car created";
    }

    @GetMapping("/findAll")
    public List<Car> findAll(){
        return repository.findAll();
    }

    @GetMapping("/findByPlate/{licencePlate}")
    public List<Car> findByPlate(@PathVariable String licencePlate) {
        return repository.findByLicencePlate(licencePlate);
    }

    @GetMapping("/findByColor/{color}")
    public List<Car> findByColor(@PathVariable String color){
        return repository.findByColor(color);
    }
}
