package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to your ToDo App");
        Task[] tasks = new Task[3];
        tasks[0] = new Task("Learn the basics of Classes and Methods in Java");
        tasks[1] = new Task("Fill out this Year Up online form. It's feedback for Yearup about how you guys think the lessons are going. https://www.surveymonkey.com/r/VXQF92Q.");
        tasks[2] = new Task("Share your most fun exercise we did in class");
        tasks[1].completed();
        for (int i = 0; i < tasks.length; i++){
            System.out.println(tasks[i]);
        }
    }

}