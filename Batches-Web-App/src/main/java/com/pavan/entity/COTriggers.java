package com.pavan.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CO_TRIGGERS")
@Data
public class COTriggers {

	@Id
	@Column(name = "TRG_ID")
	private Integer trgId;
	@Column(name = "CASE_NUM")
	private Integer caseNumber;
	@Column(name = "CREATE_DT")
	private Date createDate;
	@Column(name = "TRG_STATUS")
	private String trgStatus;
	@Column(name = "UPDATE_DT")
	private Date updateDate;
}
