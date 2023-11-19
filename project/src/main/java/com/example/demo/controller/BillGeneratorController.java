package com.example.demo.controller;

import com.example.demo.entity.BillGeneratorEntity;
import com.example.demo.service.BillGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/bills")
public class BillGeneratorController {
    @Autowired
    private final BillGeneratorService billGeneratorService;

    public BillGeneratorController(BillGeneratorService billGeneratorService) {
        this.billGeneratorService = billGeneratorService;
    }

    @GetMapping("/billsList")
    public List<BillGeneratorEntity> bills(){
        List<BillGeneratorEntity> billGeneratorList = billGeneratorService.billsList();
        return billGeneratorList;
    }

    @GetMapping("/billById")
    public Optional<BillGeneratorEntity> billById(@RequestParam Integer id){
        Optional<BillGeneratorEntity> billById = billGeneratorService.billById(id);
        return billById;
    }
    @PostMapping("/saveBill")
    public BillGeneratorEntity saveBill(@RequestBody BillGeneratorEntity billGeneratorEntity){
        return billGeneratorService.saveBill(billGeneratorEntity);
    }



}
