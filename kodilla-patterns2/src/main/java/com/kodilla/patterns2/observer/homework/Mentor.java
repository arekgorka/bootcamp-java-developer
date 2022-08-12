package com.kodilla.patterns2.observer.homework;

public class Mentor implements QueueObserver {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void updateQueueInfo(QueueTask queueTask) {
        System.out.println("Task queue for user: " + queueTask.getUser().getUsername() + " has been updated." + "\n"
        + "(Mentor " + mentorName + " has " + queueTask.getTasksQueue().size() + " task to check)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
