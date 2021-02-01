package com.pavan.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "BATCH_RUN_DTLS")
@Data
public class CoBatchRunDtls {
	@Id
	@Column(name="BATCH_RUN_SEQ")
	@SequenceGenerator(sequenceName = "BATCH_RUN_SEQ",allocationSize = 1,name = "BATCH_SEQ")
	@GeneratedValue(generator = "BATCH_SEQ",strategy = GenerationType.SEQUENCE)
	private Integer batchRunSeq;
	@Column(name="BATCH_NAME")
	private String batchName;
	@Column(name="BATCH_RUN_STATUS")
	private String batchRunStatus;
	@Column(name="END_DATE")
	private Date endDate;
	@Column(name="INSTANCE_NUM")
	private Long instanceNum;
	@Column(name="START_DATE")
	private Date startDate;

}
