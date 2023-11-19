package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="bill_info")
public class BillGeneratorEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "bill_no")
        private Integer billId;
        @Column(name = "store_name")
        private String storeName;
        @Column(name = "bill_date")
        @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
        private Date billdate;
        @Column(name = "amount")
        private long amount;

        public int getBillId() {
            return billId;
        }

        public void setBillId(int billId) {
            this.billId = billId;
        }

        public String getStoreName() {
            return storeName;
        }

        public void setStoreName(String storeName) {
            this.storeName = storeName;
        }

        public Date getBilldate() {
            return billdate;
        }

        public void setBilldate(Date billdate) {
            this.billdate = billdate;
        }

        public long getAmount() {
            return amount;
        }

        public void setAmount(long amount) {
            this.amount = amount;
        }
    }

