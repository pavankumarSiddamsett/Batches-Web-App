package com.pavan.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavan.entity.CoPdfs;

public interface CoPdfRepository extends JpaRepository<CoPdfs, Serializable>{

}
