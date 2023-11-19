package com.example.demo.repository;

import com.example.demo.entity.BillGeneratorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BillGeneratorsRepository extends JpaRepository<BillGeneratorEntity,Integer> {
    List<BillGeneratorEntity> findAll();
    Optional<BillGeneratorEntity> findById(Integer billId);
//    List<BillGeneratorEntity> saveBill(BillGeneratorEntity billGeneratorEntity);

}
