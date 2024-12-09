package com.athuull.plant_data_collector.Controller;

import com.athuull.plant_data_collector.Entity.Plant;
import com.athuull.plant_data_collector.Service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Controller
@RequestMapping("/qr")
public class PageController {

    private final PlantService plantService;

    @Autowired
    public PageController(PlantService plantService) {
        this.plantService = plantService;
    }

    @GetMapping("/")
    public String getPlantByName(@RequestParam(value = "name") String name, Model model) {
        Optional<Plant> plant = plantService.getPlantByName(name);
        if (plant.isPresent()) {
            model.addAttribute("plant", plant.get());  // Unwrap the Optional and add the Plant object to the model
        } else {
            model.addAttribute("error", "Plant not found!");  // Handle the case where the plant is not found
        }
        return "index";
    }
}