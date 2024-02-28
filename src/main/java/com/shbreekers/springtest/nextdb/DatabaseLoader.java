package com.shbreekers.springtest.nextdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final AthleteRepository athleteRepository;
    private final NoteRepository noteRepository; // Voeg je NoteRepository toe

    @Autowired
    public DatabaseLoader(AthleteRepository athleteRepository, NoteRepository noteRepository) {
        this.athleteRepository = athleteRepository;
        this.noteRepository = noteRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
//        // Voorbeeld van het opslaan van een Athlete
//        athleteRepository.save(new Athlete("Sibren", "Reekers", "sibrenreekers@gmail.com"));
//
//        // Voorbeeld van het opslaan van een Note
//        // Zorg ervoor dat je de Note klasse en NoteRepository al hebt gedefinieerd
//        noteRepository.save(new Note("Mijn eerste notitie", "Dit is de inhoud van mijn eerste notitie."));
    }
}