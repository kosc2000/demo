package com.demo.workflow.biz;

import com.demo.workflow.dto.HisTaskDto;

import java.util.List;
import java.util.Map;

public interface WorkflowService {

	List<HisTaskDto>dueList(String processInstanceId);
	String startProcessInstanceByKey(String processDefinitionKey,  Long busiId, Map<String,Object> variables);
	void complete(String taskId, Map<String,Object> variables);
	String withdrawByProcessInstanceId(String processInstanceId);
}
