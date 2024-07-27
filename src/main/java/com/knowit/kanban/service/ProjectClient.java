package com.knowit.kanban.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.knowit.kanban.entities.Project;

@FeignClient(name = "projectService")
public interface ProjectClient {

	 @GetMapping("/projects/{id}")
	    public ResponseEntity<Project> getProjectById(@PathVariable int id);
}
