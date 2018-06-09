package com.demo.workflow.action;

import com.demo.workflow.api.WorkFlowAipFeign;
import com.demo.workflow.biz.WorkflowService;
import com.demo.workflow.dto.HisTaskDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = WorkFlowUrlConstant.WORKFLOW_API)
public class WorkflowApiAction implements WorkFlowAipFeign {

    private static final Logger log = LoggerFactory
            .getLogger(WorkflowApiAction.class);

    @Autowired
    private WorkflowService workflowService;

    @Override
    public String startProcessInstanceByKey(String processDefinitionKey, Long busiId, Map<String, Object> variables) {
        return workflowService.startProcessInstanceByKey(processDefinitionKey,busiId,variables);
    }

    @Override
    public void complete(String taskId, Map<String, Object> variables) {
         workflowService.complete(taskId,variables);
    }

    @Override
    public void withdrawByProcessInstanceId(String processInstanceId) {

        workflowService.withdrawByProcessInstanceId(processInstanceId);
    }

    @Override
    public List<HisTaskDto> dueList(String processInstanceId) {

       return  workflowService.dueList(processInstanceId);
    }
}
