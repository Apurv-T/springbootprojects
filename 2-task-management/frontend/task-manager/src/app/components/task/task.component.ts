import { Component, Input } from '@angular/core';
import { Task } from 'src/app/model/Task';

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.scss']
})
export class TaskComponent {
  @Input()
  public task: Task;
  @Input()
  public id: Number;
  constructor() { }
  complete() {
    console.log(this.id);

  }
  remove() {
    console.log(this.id);
  }
}

