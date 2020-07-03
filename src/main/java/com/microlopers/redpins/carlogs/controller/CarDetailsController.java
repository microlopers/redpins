package com.microlopers.redpins.carlogs.controller;

import com.microlopers.redpins.carlogs.persistence.CarLogRepository;
import com.microlopers.redpins.carlogs.persistence.entity.Car;
import com.microlopers.redpins.carlogs.persistence.CarRepository;
import com.microlopers.redpins.carlogs.persistence.entity.CarLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "https://localhost:3000")
@RestController
public class CarDetailsController {

    @Autowired
    CarRepository repository;

    @Autowired
    CarLogRepository carLogRepository;

    @GetMapping("/bulkcreate")
    public String bulkCreate() {
        repository.save(new Car("ZA-001AB", "ford", "white"));
        repository.saveAll(Arrays.asList(new Car("plate2", "ford", "blue"),
                new Car("plate3", "opel", "blue"),
                new Car("plate4", "opel", "red")));

        carLogRepository.save(new CarLog(1,"ZA-001AB", "Zilina", "Bratislava", LocalDate.now().minusMonths(3), LocalDate.now().minusMonths(3), "Konzultacie IBM"          , 10200, new BigDecimal(420), new BigDecimal(0), new BigDecimal(0), new BigDecimal(45), 1, new BigDecimal(130), new BigDecimal(90)));
        carLogRepository.saveAll(Arrays.asList(
                new CarLog(2,"ZA-001AB", "Zilina", "Bratislava", LocalDate.now().minusMonths(3), LocalDate.now().minusMonths(3), "Konzultacie IBM"          , 10200, new BigDecimal(420), new BigDecimal(0), new BigDecimal(0), new BigDecimal(45), 1, new BigDecimal(130), new BigDecimal(90)),
                new CarLog(3,"ZA-001AB", "Bratislava", "Zilina", LocalDate.now().minusMonths(3), LocalDate.now().minusMonths(3), "Konzultacie IBM"          , 10200, new BigDecimal(420), new BigDecimal(0), new BigDecimal(0), new BigDecimal(45), 1, new BigDecimal(130), new BigDecimal(90)),
                new CarLog(4,"ZA-001AB", "Zilina", "Bratislava", LocalDate.now().minusMonths(3), LocalDate.now().minusMonths(3), "Konzultacie IBM"          , 10200, new BigDecimal(420), new BigDecimal(0), new BigDecimal(0), new BigDecimal(45), 1, new BigDecimal(130), new BigDecimal(90)),
                new CarLog(5,"ZA-001AB", "Bratislava", "Zilina", LocalDate.now().minusMonths(3), LocalDate.now().minusMonths(3), "Konzultacie IBM"          , 10200, new BigDecimal(420), new BigDecimal(0), new BigDecimal(0), new BigDecimal(45), 1, new BigDecimal(130), new BigDecimal(90))));
        return "Data created";
    }

    @GetMapping("/findAll")
    public List<Car> findAll(){
        return repository.findAll();
    }

    @GetMapping("/findByPlate/{licencePlateId}")
    public List<Car> findByPlate(@PathVariable String licencePlateId) {
        return repository.findByLicencePlateId(licencePlateId);
    }

    @GetMapping("/findByColor/{color}")
    public List<Car> findByColor(@PathVariable String color){
        return repository.findByColor(color);
    }

    @GetMapping("/findAllCarlogs")
    public List<CarLog> findAllCarlogs(){
        return carLogRepository.findAll();
    }
}
