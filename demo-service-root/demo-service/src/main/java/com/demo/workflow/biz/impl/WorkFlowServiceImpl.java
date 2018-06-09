package com.demo.workflow.biz.impl;

import com.demo.workflow.biz.WorkflowService;
import com.demo.workflow.dto.HisTaskDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("workflowService")
@Transactional
public class WorkFlowServiceImpl implements WorkflowService {

	@Override
	public List<HisTaskDto> dueList(String processInstanceId) {
		return null;
	}

	@Override
	public String startProcessInstanceByKey(String processDefinitionKey, Long busiId, Map<String, Object> variables) {
		return null;
	}

	@Override
	public void complete(String taskId, Map<String, Object> variables) {

	}

	@Override
	public String withdrawByProcessInstanceId(String processInstanceId) {
		return null;
	}
}
