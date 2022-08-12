package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueTask implements QueueObservable {

    private final List<QueueObserver> observers;
    private final Queue<String> tasksQueue;
    private final User user;

    public QueueTask(User user) {
        observers = new ArrayList<>();
        tasksQueue = new LinkedList<>();
        this.user = user;
    }

    public void sendTask(String task) {
        tasksQueue.add(task);
        notifyQueueObservers();
    }

    @Override
    public void registerQueueObserver(QueueObserver queueObserver) {
        observers.add(queueObserver);
    }

    @Override
    public void notifyQueueObservers() {
        for(QueueObserver queueObserver : observers) {
            queueObserver.updateQueueInfo(this);
        }
    }

    @Override
    public void removeQueueObserver(QueueObserver queueObserver) {
        observers.remove(queueObserver);
    }

    public Queue<String> getTasksQueue() {
        return tasksQueue;
    }

    public User getUser() {
        return user;
    }
}
