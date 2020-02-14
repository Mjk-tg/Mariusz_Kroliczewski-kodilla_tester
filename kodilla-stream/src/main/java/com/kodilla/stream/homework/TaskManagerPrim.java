package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManagerPrim {

    public static void main(String[] args) {
        List<String> tasks = TaskRepository.getTaskList()
                .stream()
                .filter(f ->f.deadline.isAfter(LocalDate.now()))
                .map(TaskManagerPrim::getTaskToDo)
                .collect(Collectors.toList());
        System.out.println(tasks);
    }

    public static String getTaskToDo(Task task) {
        return (task.getDeadline() + " " + task.getTaskName());
    }

}
