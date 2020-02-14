package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;


public class ForumStats {
    public static void main(String[] args) {
        double avgPostsAboveForty = UsersRepository.getUserList()
                .stream()
                .filter(a -> a.getAge()>=40)
                .map(User::getNumberOfPosts)
                .mapToInt(p -> p)
                .average()
                .getAsDouble();

        double avgPostsBelowForty = UsersRepository.getUserList()
                .stream()
                .filter(a -> a.getAge() < 40)
                .map(User::getNumberOfPosts)
                .mapToInt(o -> o)
                .average()
                .getAsDouble();

        System.out.println("Quantity of the posts send by users:" + " with age above forty = " + avgPostsAboveForty+";" + " with age below forty = " + avgPostsBelowForty);
    }
}
