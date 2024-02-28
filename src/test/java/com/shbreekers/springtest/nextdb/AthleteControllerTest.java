package com.shbreekers.springtest.nextdb;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.mockito.BDDMockito.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

@WebMvcTest(AthleteController.class)
public class AthleteControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AthleteRepository athleteRepository;

    @Test
    public void getAllAthletes_ShouldReturnAthletes() throws Exception {
        Athlete athlete = new Athlete("John", "Doe", "john.doe@example.com");

        given(athleteRepository.findAll()).willReturn(Collections.singletonList(athlete));

        mockMvc.perform(get("/api/athletes"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].firstName").value(athlete.getFirstName()));
    }
}
