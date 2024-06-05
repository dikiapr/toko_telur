package com.toko_telur.demo.controller;

import com.toko_telur.demo.dto.EggProductionDTO;
import com.toko_telur.demo.service.EggProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EggProductionController {

    @Autowired
    private EggProductionService eggProductionService;

    @PostMapping("/egg-production")
    public ResponseEntity<String> inputEggProduction(@RequestBody EggProductionDTO eggProductionDTO) {
        eggProductionService.inputEggProduction(eggProductionDTO.getNumberOfEggs());
        return ResponseEntity.status(HttpStatus.CREATED).body("Data produksi telur berhasil disimpan.");
    }
}
