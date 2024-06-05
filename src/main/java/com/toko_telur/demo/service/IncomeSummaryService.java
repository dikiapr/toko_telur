package com.toko_telur.demo.service;

import com.toko_telur.demo.model.EggProduction;
import com.toko_telur.demo.repository.EggProductionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncomeSummaryService {

    private final int PRICE_PER_EGG = 1000;

    @Autowired
    private EggProductionRepository eggProductionRepository;

    public int calculateTotalIncome() {
        int totalEggs = 0;
        for (EggProduction eggProduction : eggProductionRepository.findAll()) {
            totalEggs += eggProduction.getNumberOfEggs();
        }
        return totalEggs * PRICE_PER_EGG;
    }
}
