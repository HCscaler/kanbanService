package com.knowit.kanban.entities;

import java.util.List;

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
public class DTO {

	public List<Task> OPEN;
	public List<Task> IN_PROGRESS;
	public List<Task> COMPLETED;
	public List<Task> CANCELLED;
}
