package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class StatistiqueTests {

    Statistique stat;

    @BeforeEach
    public void init(){
        stat = new StatistiqueImpl();
        Voiture voiture1 = new Voiture("Renault", 1000);
        Voiture voiture2 = new Voiture("Peugeot", 4000);
        stat.ajouter(voiture1);
        stat.ajouter(voiture2);
    }

    @Test
    public void modifStatistique(){
        Echantillon echantillon = stat.prixMoyen();
        assertEquals(echantillon.getNombreDeVoitures(),2);
        assertEquals(echantillon.getPrixMoyen(),2500);

    }

    
    @Test
    public void modifEchantillonRecu(){
        Echantillon echantillon = stat.prixMoyen();
        echantillon.setNombreDeVoitures(40);
        echantillon.setPrixMoyen(6500);
        assertEquals(echantillon.getPrixMoyen(),6500);
        assertEquals(echantillon.getNombreDeVoitures(),40);

    }



    
        
}