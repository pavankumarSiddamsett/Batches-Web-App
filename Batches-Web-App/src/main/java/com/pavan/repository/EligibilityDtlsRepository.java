package com.pavan.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavan.entity.EligibilityDetails;

public interface EligibilityDtlsRepository extends JpaRepository<EligibilityDetails,Serializable>{

}
