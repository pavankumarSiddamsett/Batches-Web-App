package com.pavan.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavan.entity.CoBatchRunDtls;

public interface BatchRunDtlsRepository extends JpaRepository<CoBatchRunDtls, Serializable>{

}
