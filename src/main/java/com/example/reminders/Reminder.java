package com.example.reminders;

public class Reminder {

    private final long id;

    private final String message;

    public Reminder(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
