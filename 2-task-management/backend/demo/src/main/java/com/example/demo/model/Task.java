package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name="tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String owner;

    private Date endDate;

    private boolean isComplete;

    public Task(String name, String description, String owner, Date endDate) {
        this.name = name;
        this.description = description;
        this.owner = owner;
        this.endDate = endDate;
        this.isComplete=false;
    }
    public Task(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='"+id+'\''+
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", owner='" + owner + '\'' +
                ", endDate=" + endDate +
                '}';
    }
}
