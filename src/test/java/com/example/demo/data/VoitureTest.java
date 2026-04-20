package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    @BeforeEach
    void initVoitureTest(){
        String marque = "Renault";
        int prix = 1000;
        Voiture voiture = new Voiture(marque,prix);
    }

    @Test
    void creerVoiture(){
        assertEquals(marque, voiture.getMarque);
        assertEquals(prix, voiture.getPrix);
    }

    @Test
    void modifVoiture(){
        String newMarque = "Peugeot";
        int newPrix = 2000;
        voiture.setMarque(newMarque);
        voiture.setPrix(newPrix);
        voiture.setId(10);
        assertEquals(newMarque, voiture.getMarque);
        assertEquals(prix, voiture.getPrix);
        assertEquals(10, voiture.getId);
    }

}
