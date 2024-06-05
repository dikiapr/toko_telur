package com.toko_telur.demo.controller;


import com.toko_telur.demo.service.IncomeSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IncomeSummaryController {

    @Autowired
    private IncomeSummaryService incomeSummaryService;

    @GetMapping("/income-summary")
    public ResponseEntity<String> calculateTotalIncome() {
        int totalIncome = incomeSummaryService.calculateTotalIncome();
        String message = "total penghasilan berdasarkan jumlah telur: " + totalIncome;
        return ResponseEntity.ok(message);
    }
}
