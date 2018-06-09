package com.demo.workflow.dto;



public class TaskDto {

	private String id;
	private String name;
	private String description;
	private Integer priority;
	private String owner;
	private String assignee;
	private String assigneeName;
	private String processInstanceId;
	private String executionId;
	private String processDefinitionId;
	private String processDefinitionName;
	private String processDefinitionKey;
	private String createTime;
	private String taskDefinitionKey;
	private String dueDate;
	private Integer restDay;
	private String category;
	private String parentTaskId;
	private String tenantId;
	private String applyUserId;
	private String applyUserName;
	private String applyOrgName;
	private String applyCompanyName;
	private String oldSettlementCode; /** 原结算单号：只在当有结算单驳回后再上报时出现 */

	public String getId() {
		return id;
	}

	public String getCreateTime() {
		return createTime;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public String getAssigneeName() {
		return assigneeName;
	}

	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getExecutionId() {
		return executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public String getProcessDefinitionId() {
		return processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}



	public String getTaskDefinitionKey() {
		return taskDefinitionKey;
	}

	public void setTaskDefinitionKey(String taskDefinitionKey) {
		this.taskDefinitionKey = taskDefinitionKey;
	}


	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getParentTaskId() {
		return parentTaskId;
	}

	public void setParentTaskId(String parentTaskId) {
		this.parentTaskId = parentTaskId;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getApplyUserId() {
		return applyUserId;
	}

	public void setApplyUserId(String applyUserId) {
		this.applyUserId = applyUserId;
	}

	public String getApplyUserName() {
		return applyUserName;
	}

	public void setApplyUserName(String applyUserName) {
		this.applyUserName = applyUserName;
	}

	public String getProcessDefinitionName() {
		return processDefinitionName;
	}

	public void setProcessDefinitionName(String processDefinitionName) {
		this.processDefinitionName = processDefinitionName;
	}

	public Integer getRestDay() {
		return restDay;
	}

	public void setRestDay(Integer restDay) {
		this.restDay = restDay;
	}

	public String getProcessDefinitionKey() {
		return processDefinitionKey;
	}

	public void setProcessDefinitionKey(String processDefinitionKey) {
		this.processDefinitionKey = processDefinitionKey;
	}

	public String getApplyOrgName() {
		return applyOrgName;
	}

	public void setApplyOrgName(String applyOrgName) {
		this.applyOrgName = applyOrgName;
	}

	public String getApplyCompanyName() {
		return applyCompanyName;
	}

	public void setApplyCompanyName(String applyCompanyName) {
		this.applyCompanyName = applyCompanyName;
	}

	public String getOldSettlementCode() {
		return oldSettlementCode;
	}

	public void setOldSettlementCode(String oldSettlementCode) {
		this.oldSettlementCode = oldSettlementCode;
	}
}
