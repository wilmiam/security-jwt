package com.wilmiam.oauth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @GetMapping("/getTasks")
    public String listTasks() {
        return "任务列表";
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public String newTasks() {
        return "创建了一个新的任务";
    }

}

