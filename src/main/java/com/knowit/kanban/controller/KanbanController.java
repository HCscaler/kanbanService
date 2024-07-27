package com.knowit.kanban.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knowit.kanban.entities.Project;
import com.knowit.kanban.service.KanbanService;

@RestController
@RequestMapping("/kanban")
public class KanbanController {
	
	@Autowired
	private KanbanService kanbanService;

	@GetMapping("/project/{id}")
	public ResponseEntity<Project> getProjectById(@PathVariable int id)
	{
		return kanbanService.getProjectById(id);
	}
}
