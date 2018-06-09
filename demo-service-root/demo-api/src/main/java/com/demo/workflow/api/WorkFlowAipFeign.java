package com.demo.workflow.api;

import com.demo.workflow.dto.HisTaskDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
@FeignClient(serviceId = "workflow-service",path = "workflowApi")
public interface WorkFlowAipFeign {
	@RequestMapping("/start")
	String startProcessInstanceByKey(@RequestParam("processDefinitionKey") String processDefinitionKey, @RequestParam("busiId")Long busiId,@RequestBody Map<String,Object> variables);
	@RequestMapping("/complete")
	void complete(@RequestParam("taskId")String taskId,@RequestBody Map<String,Object> variables);
	@RequestMapping("/withdraw")
	void withdrawByProcessInstanceId(@RequestParam("processInstanceId")String processInstanceId);
	@RequestMapping("/dueList")
	List<HisTaskDto>dueList(@RequestParam("taskId")String processInstanceId);
}
