package com.microlopers.redpins.carlogs.persistence;

import com.microlopers.redpins.carlogs.persistence.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findByLicencePlate(String licencePlate);

    List<Car> findByColor(String color);

    List<Car> findAll();

}
