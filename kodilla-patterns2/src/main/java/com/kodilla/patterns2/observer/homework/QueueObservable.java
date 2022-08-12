package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface QueueObservable {
    void registerQueueObserver(QueueObserver queueObserver);
    void notifyQueueObservers();
    void removeQueueObserver(QueueObserver queueObserver);
}
