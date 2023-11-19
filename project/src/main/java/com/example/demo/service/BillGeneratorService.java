package com.example.demo.service;

import com.example.demo.entity.BillGeneratorEntity;
import com.example.demo.repository.BillGeneratorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillGeneratorService {
    @Autowired
    private final BillGeneratorsRepository billGeneratorRepository;

    public BillGeneratorService(BillGeneratorsRepository billGeneratoryRepository) {
        this.billGeneratorRepository = billGeneratoryRepository;
    }

    public List<BillGeneratorEntity> billsList(){
        List<BillGeneratorEntity> billsList = billGeneratorRepository.findAll();
        return billsList;
    }

    public Optional<BillGeneratorEntity> billById(Integer id){
        Optional<BillGeneratorEntity> byId = billGeneratorRepository.findById(id);
        return byId;
    }

    public BillGeneratorEntity saveBill(BillGeneratorEntity billGeneratorEntity){
        BillGeneratorEntity save = billGeneratorRepository.save(billGeneratorEntity);
        return save;
    }
}
