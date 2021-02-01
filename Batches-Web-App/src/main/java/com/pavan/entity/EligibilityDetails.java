package com.pavan.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "ELIGIBILITY_DETAILS")
@Data
public class EligibilityDetails {
	@Id
	@Column(name="ED_TRACE_ID")
	private Integer edTraceId;
	@Column(name="BENEFIT_AMT")
	private Double benefitAmt;
	@Column(name="CASE_NUM")
	private Integer caseNumber;
	@Column(name="CREATE_DT")
	private Date createDate;
	@Column(name="DENIAL_REASON")
	private String denialReason;
	@Column(name="PLAN_END_DT")
	private Date planEndDate;
	@Column(name="PLAN_NAME")
	private String planName;
	@Column(name="PLAN_START_DT")
	private String planStartDate;
	@Column(name="PLAN_STATUS")
	private String planStatus;
	@Column(name="UPDATE_DT")
	private Date updateDate;
	
	
}
