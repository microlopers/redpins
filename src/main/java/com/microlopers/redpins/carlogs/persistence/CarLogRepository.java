package com.microlopers.redpins.carlogs.persistence;

import com.microlopers.redpins.carlogs.persistence.entity.Car;
import com.microlopers.redpins.carlogs.persistence.entity.CarLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarLogRepository extends JpaRepository<CarLog, Long> {

    List<CarLog> findByCarLicenceId(String carLicenceId);

    List<CarLog> findById(long id);

    List<CarLog> findAll();

}
