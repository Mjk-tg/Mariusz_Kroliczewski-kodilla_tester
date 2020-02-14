package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    static List<Task> getTaskList() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Wash the car", LocalDate.of(2020,1,12),LocalDate.of(2020,2,5)));
        tasks.add(new Task("Buy Valentine gifts", LocalDate.of(2020, 1,31),LocalDate.of(2020, 2,13)));
        tasks.add(new Task("Go to the swimming pool", LocalDate.of(2020, 2,12),LocalDate.of(2020, 2,21)));
        tasks.add(new Task("Finish an exercise", LocalDate.of(2020,2,10),LocalDate.of(2020,2,15)));
        tasks.add(new Task("Return the book to the library", LocalDate.of(2020, 2,12),LocalDate.of(2020, 2,29)));

        return tasks;
    }

}
