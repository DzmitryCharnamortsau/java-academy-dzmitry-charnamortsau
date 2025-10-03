package com.pluralsight;

import java.time.LocalDate;

public class Task {
    //string title
    //local date due date
    // urgency
    //notifications
    //boolean reminder yes no

    //instance variables
    // a variable linked to a class object
    private String title;
    private LocalDate dueDate;
    private boolean complete;
    private String urgency;
    private String notificationMessage;
    private boolean Reminder;
    private boolean completed;

    public Task(String title) {
        this.title = title;
    }

    public boolean completed() {
        return this.completed = true;
    }

    @Override
    public String toString() {
        if (completed) {
            return "[✓] " + title;
        } else {
            return "[ ] " + title;
        }
    }
}