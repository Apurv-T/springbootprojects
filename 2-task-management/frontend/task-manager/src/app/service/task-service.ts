import { HttpClient } from "@angular/common/http";
import { Task } from "../model/Task";
import { Injectable } from "@angular/core";
@Injectable()
export class TaskService {
    constructor(private httpClient: HttpClient) {

    }
    public getTasks() {
        let url = "http://localhost:8080/api/tasks/alltasks"
        return this.httpClient.get<Task[]>(url);
    }
}
