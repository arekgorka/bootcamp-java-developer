package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTaskTestSuite {

    @Test
    public void testUpdatedQueueInfo() {
        //Given
        User johnMeyer = new User("John Meyer");
        User bryanMarvic = new User("Bryan Marvic");
        User angelicaAngel = new User("Angelica Angel");
        User chrisMartin = new User("Chris Martin");
        QueueTask johnMeyerQueueTask = new QueueTask(johnMeyer);
        QueueTask bryanMarvicQueueTask = new QueueTask(bryanMarvic);
        QueueTask angelicaAngelQueueTask = new QueueTask(angelicaAngel);
        QueueTask chrisMartinQueueTask = new QueueTask(chrisMartin);
        Mentor mentorAAA = new Mentor("Arnold Aus Angrlem");
        Mentor mentorBBB = new Mentor("Bohna Bon Buiqex");
        johnMeyerQueueTask.registerQueueObserver(mentorAAA);
        bryanMarvicQueueTask.registerQueueObserver(mentorAAA);
        angelicaAngelQueueTask.registerQueueObserver(mentorBBB);
        chrisMartinQueueTask.registerQueueObserver(mentorBBB);
        //When
        johnMeyerQueueTask.sendTask("Modul 13.2 - Something");
        johnMeyerQueueTask.sendTask("Configuration Tasks_Crud");
        bryanMarvicQueueTask.sendTask("Add new function to project");
        angelicaAngelQueueTask.sendTask("Modul 24.3 - Facade");
        angelicaAngelQueueTask.sendTask("Calculator - set fraction");
        angelicaAngelQueueTask.sendTask("Hibernate Configuration");
        chrisMartinQueueTask.sendTask("Heroku - set auto deploy");
        chrisMartinQueueTask.sendTask("Finished library_crud");
        //Then
        assertEquals(3, mentorAAA.getUpdateCount());
        assertEquals(5, mentorBBB.getUpdateCount());
    }
}
