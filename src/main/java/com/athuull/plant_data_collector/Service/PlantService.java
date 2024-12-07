package com.athuull.plant_data_collector.Service;

import com.athuull.plant_data_collector.Entity.Plant;
import com.athuull.plant_data_collector.Repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlantService {
    private final PlantRepository plantRepository;

    @Autowired
    public PlantService(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    // Save plant to the db
    public Plant savePlant(Plant plant) {
        return plantRepository.save(plant);
    }

    // Get all plants in the db
    public List<Plant> getPlants() {
        return plantRepository.findAll();
    }

    // Get a plant by id
    public Optional<Plant> getPlantById(Long id) {
        return plantRepository.findById(id);
    }
}
