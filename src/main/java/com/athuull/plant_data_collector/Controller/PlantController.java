package com.athuull.plant_data_collector.Controller;

import com.athuull.plant_data_collector.Entity.Plant;
import com.athuull.plant_data_collector.Service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(path = "/api")
@RestController
public class PlantController {


    private final PlantService plantService;


    @Autowired
    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }

    @PostMapping("/createPlants")
    public ResponseEntity<Plant> savePlant(@RequestBody Plant plant) {
        Plant savedPlant = plantService.savePlant(plant);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPlant);
    }

    @GetMapping("/plants")
    public List<Plant> getAllPlants() {
        return plantService.getPlants();
    }

    @GetMapping("/plants/{id}")
    public Optional<Plant> getPlantById(@PathVariable Long id) {
        return plantService.getPlantById(id);
    }
}
