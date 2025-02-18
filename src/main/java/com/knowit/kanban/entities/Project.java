package com.knowit.kanban.entities;

import lombok.*;

import java.time.LocalDate;
import java.util.List;


public class Project {
    private int id;
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate dueDate;
    private int userId;
    transient List<Task> task;

    public List<Task> getTask() {
		return task;
	}

	public void setTask(List<Task> task) {
		this.task = task;
	}

	public Project() {
    }

    public Project(int id, String title, String description, LocalDate startDate, LocalDate dueDate, int userId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.userId = userId;
    }

    public Project(String title, String description, LocalDate startDate, LocalDate dueDate, int userId) {
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", dueDate=" + dueDate +
                ", userId=" + userId +
                '}';
    }
}

