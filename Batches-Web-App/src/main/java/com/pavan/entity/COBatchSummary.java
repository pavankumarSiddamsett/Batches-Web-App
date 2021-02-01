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
@Table(name="BATCH_SUMMARY")
@Data
public class COBatchSummary {
	@Id
	@Column(name="BATCH_ID")
	@SequenceGenerator(sequenceName = "BATCH_SUMMARY_SEQ",allocationSize = 1,name = "BATCH_SUMM_SEQ")
	@GeneratedValue(generator = "BATCH_SUMM_SEQ",strategy = GenerationType.SEQUENCE)
	private Integer batchId;
	@Column(name="BATCH_NAME")
	private String batchName;
	@Column(name="FAILURE_TRIGGER_COUNT")
	private Integer failureTriggerCount;
	@Column(name="SUCCESS_TRIGGER_COUNT")
	private Integer succTriggerCount;
	@Column(name="TOTAL_TRIGGER_PROCESSED")
	private String totTriggerProcessed;
	
}
