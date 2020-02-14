package com.kodilla.stream.homework;

import java.time.LocalDate;

public class TaskManager {
    public static void main(String[] args) {
        TaskRepository.getTaskList()
                .stream()
                .filter(f -> f.deadline.isAfter(LocalDate.now()))
                .map(TaskManager::getDeadline)
                .forEach(System.out::println);
    }

    public static LocalDate getDeadline(Task task) {
        return task.getDeadline();
    }

}