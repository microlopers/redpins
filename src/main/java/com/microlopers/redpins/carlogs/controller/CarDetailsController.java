package com.microlopers.redpins.carlogs.controller;

import com.microlopers.redpins.carlogs.entity.CarDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://localhost:3000")
@RestController
public class CarDetailsController {
    @GetMapping("/cardetails")
    public CarDetails getCarDetails(@RequestParam(value = "id", defaultValue = "0") int id) {
        return new CarDetails(0,"not defined");
    }
}
