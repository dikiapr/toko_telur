package com.toko_telur.demo.repository;

import com.toko_telur.demo.model.EggProduction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EggProductionRepository extends JpaRepository<EggProduction, Long> {
}
