package com.demo.workflow.dto;



public class HisTaskDto extends TaskDto {
	
	  private String deleteReason;
	  
	
	  private String startTime;

	
	  private String endTime;

	 
	  private Long durationInMillis;
	  
	
	  private Long workTimeInMillis;
	  
	
	  private String claimTime;
	  private String result;
	  private String resultMessage;
	  private String oldSettlementCode; /** 原结算单号：只在当有结算单驳回后再上报时出现 */
	  private Boolean canSetPerson;

	public String getDeleteReason() {
		return deleteReason;
	}


	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	public String getResultMessage() {
		return resultMessage;
	}


	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}


	public void setDeleteReason(String deleteReason) {
		this.deleteReason = deleteReason;
	}


	public String getStartTime() {
		return startTime;
	}


	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}


	public String getEndTime() {
		return endTime;
	}


	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}


	public Long getDurationInMillis() {
		return durationInMillis;
	}


	public void setDurationInMillis(Long durationInMillis) {
		this.durationInMillis = durationInMillis;
	}


	public Long getWorkTimeInMillis() {
		return workTimeInMillis;
	}


	public void setWorkTimeInMillis(Long workTimeInMillis) {
		this.workTimeInMillis = workTimeInMillis;
	}


	public String getClaimTime() {
		return claimTime;
	}


	public void setClaimTime(String claimTime) {
		this.claimTime = claimTime;
	}


	public String getOldSettlementCode() {
		return oldSettlementCode;
	}


	public void setOldSettlementCode(String oldSettlementCode) {
		this.oldSettlementCode = oldSettlementCode;
	}


	public Boolean getCanSetPerson() {
		return canSetPerson;
	}


	public void setCanSetPerson(Boolean canSetPerson) {
		this.canSetPerson = canSetPerson;
	}
	
}
