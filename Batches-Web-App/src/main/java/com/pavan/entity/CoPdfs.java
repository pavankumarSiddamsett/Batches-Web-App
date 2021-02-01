package com.pavan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class CoPdfs {
	
	@Id
	@Column(name="CO_PDF_ID")
	@SequenceGenerator(sequenceName = "COPDF_SEQ",allocationSize = 1,name = "PDF_SEQ")
	@GeneratedValue(generator = "PDF_SEQ",strategy = GenerationType.SEQUENCE)
	private Integer coPdfId;
	@Column(name="PLAN_STATUS")
	private String planStatus;
	@Column(name="CASE_NUMBER")
	private Integer caseNumber;
	@Column(name="PDF_DOCUMENT")
	private Byte[] pdfDocument;
	@Column(name="PLAN_NAME")
	private String planName;
}
