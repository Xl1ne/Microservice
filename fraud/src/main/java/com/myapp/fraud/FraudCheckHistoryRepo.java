package com.myapp.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckHistoryRepo
        extends JpaRepository<FraudCheckHistory, Integer> {
}