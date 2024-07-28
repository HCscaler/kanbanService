package com.knowit.kanban.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knowit.kanban.entities.DTO;
import com.knowit.kanban.entities.Project;
import com.knowit.kanban.entities.Task;
import com.knowit.kanban.service.KanbanService;

@RestController
@RequestMapping("/kanban")
public class KanbanController {
	
	@Autowired
	private KanbanService kanbanService;

	@GetMapping("/project/{id}")
	public DTO getProjectById(@PathVariable int id)
	{
		Project project =kanbanService.getProjectById(id).getBody();
		List<Task> OPEN = new ArrayList<Task>();
		List<Task> IN_PROGRESS = new ArrayList<Task>();
		List<Task> COMPLETED = new ArrayList<Task>();
		List<Task> CANCELLED = new ArrayList<Task>();
		
		for(Task task : project.getTask())
		{
			switch (task.getStatus()) {
			case OPEN: {
				OPEN.add(task);
			}
			break;
			case IN_PROGRESS: {
				IN_PROGRESS.add(task);
			}
			break;
			case COMPLETED: {
				COMPLETED.add(task);
			}
			break;
			case CANCELLED: {
				CANCELLED.add(task);
			}
			break;
			default : break;
				
			}
		}
		DTO dto = new DTO(OPEN,IN_PROGRESS,COMPLETED,CANCELLED);
		
		return dto;
	}
}
