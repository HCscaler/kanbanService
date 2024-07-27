package com.knowit.kanban.entities;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
	    
	    private int id;
	    private int projectId;
	    private Integer taskId;
	    private String text;
	    private LocalDateTime timestamp;
	    private int userId;
	    
	}
