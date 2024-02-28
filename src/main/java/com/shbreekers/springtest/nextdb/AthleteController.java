package com.shbreekers.springtest.nextdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/athletes")
public class AthleteController {

    private final AthleteRepository athleteRepository;

    @Autowired
    public AthleteController(AthleteRepository athleteRepository) {
        this.athleteRepository = athleteRepository;
    }

    @GetMapping
    public List<Athlete> getAllAthletes() {
        return athleteRepository.findAll();
    }

    @PostMapping
    public Athlete addAthlete(@RequestBody Athlete athlete) {
        return athleteRepository.save(athlete);
    }
}
