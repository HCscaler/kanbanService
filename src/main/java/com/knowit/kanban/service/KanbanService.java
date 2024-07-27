package com.knowit.kanban.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.knowit.kanban.entities.Project;
@Service
public class KanbanService {
	
	@Autowired
	private ProjectClient projectClient;
	
	public ResponseEntity<Project> getProjectById(int id)
	{
		ResponseEntity<Project> project = projectClient.getProjectById(id);
		return project;
	}

}
