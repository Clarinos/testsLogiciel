package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    private static String marque;
    private static int prix;
    private static Voiture voiture;

    @BeforeEach
    void initVoitureTest(){
        VoitureTest.marque = "Renault";
        VoitureTest.prix = 1000;
        voiture = new Voiture(VoitureTest.marque,VoitureTest.prix);
    }

    @Test
    void creerVoiture(){
        assertEquals(VoitureTest.marque, voiture.getMarque());
        assertEquals(VoitureTest.prix, voiture.getPrix());
    }

    @Test
    void modifVoiture(){
        String newMarque = "Peugeot";
        int newPrix = 2000;
        voiture.setMarque(newMarque);
        voiture.setPrix(newPrix);
        voiture.setId(10);
        assertEquals(newMarque, voiture.getMarque());
        assertEquals(newPrix, voiture.getPrix());
        assertEquals(10, voiture.getId());
    }

}
