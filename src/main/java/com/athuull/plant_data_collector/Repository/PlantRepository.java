package com.athuull.plant_data_collector.Repository;

import com.athuull.plant_data_collector.Entity.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlantRepository extends JpaRepository<Plant, Long> {
    Optional<Plant> findByName(String name);
}
