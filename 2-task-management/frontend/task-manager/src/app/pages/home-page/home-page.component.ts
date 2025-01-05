import { Component } from '@angular/core';
import { Task } from '../../model/Task';
import { TaskService } from 'src/app/service/task-service';
@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.scss']
})
export class HomePageComponent {
  pendingTasks: Task[] = [];
  completedTasks: Task[] = [];
  constructor(private taskService: TaskService) { }
  fetchTasks() {
    console.log('Tasks fetching...');
    this.taskService.getTasks().subscribe((tasks) => {
      console.log(tasks);

      this.completedTasks = tasks.filter((task) => task.complete)
      this.pendingTasks = tasks.filter((task) => !task.complete)
    })
  }
}
