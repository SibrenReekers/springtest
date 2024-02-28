package com.shbreekers.springtest.nextdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final AthleteRepository athleteRepository; // Voeg je AthleteRepository toe
    @Autowired
    public DatabaseLoader(AthleteRepository athleteRepository) {
        this.athleteRepository = athleteRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
//        // Voorbeeld van het opslaan van een Athlete
//        athleteRepository.save(new Athlete("Sibren", "Reekers", "sibrenreekers@gmail.com"));
    }
}
