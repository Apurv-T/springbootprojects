package com.example.demo.service;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public TaskService( TaskRepository taskRepo){
        this.taskRepository=taskRepo;
    }
    public TaskService(){}
    //get
    public List<Task> getAllTasks(){
        return this.taskRepository.findAll();
    }
    public Optional<Task> getTask(Long id){
       return this.taskRepository.findById(id);
    }
    //add
    public Task addTask(Task t){
      return  this.taskRepository.save(t);
    }
    //update task
    public Task updateTask(Task t, Long id){
     return   this.getTask(id).map(task->{
           task.setComplete(t.isComplete());
           task.setDescription(t.getDescription());
           task.setEndDate(t.getEndDate());
           task.setOwner(t.getOwner());
           task.setName(t.getName());
        return    this.taskRepository.save(task);
       }).orElseThrow(()-> new RuntimeException("Task not found"));
    }
    //delete task
    public void deleteById(Long id){
         this.taskRepository.deleteById(id);
    }

}
