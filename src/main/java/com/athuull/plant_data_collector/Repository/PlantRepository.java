package com.athuull.plant_data_collector.Repository;

import com.athuull.plant_data_collector.Entity.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantRepository extends JpaRepository<Plant, Long> {
}
