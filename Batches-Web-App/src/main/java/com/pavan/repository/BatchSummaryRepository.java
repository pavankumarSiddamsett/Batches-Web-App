package com.pavan.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavan.entity.COBatchSummary;

public interface BatchSummaryRepository extends JpaRepository<COBatchSummary,Serializable>{

}
