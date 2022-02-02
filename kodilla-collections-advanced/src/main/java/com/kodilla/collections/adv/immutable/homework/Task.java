package com.kodilla.collections.adv.immutable.homework;

public class Task {
    protected final String title;
    protected final int duration;

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    final public String getTitle() {
        return title;
    }

    final public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
