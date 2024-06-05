package com.toko_telur.demo.service;

import com.toko_telur.demo.model.EggProduction;
import com.toko_telur.demo.repository.EggProductionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EggProductionService {

    @Autowired
    private EggProductionRepository eggProductionRepository;

    public void inputEggProduction(int numberOfEggs) {
        EggProduction eggProduction = new EggProduction();
        eggProduction.setNumberOfEggs(numberOfEggs);
        eggProductionRepository.save(eggProduction);
    }
}
