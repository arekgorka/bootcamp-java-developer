package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Mills");
        User nikita = new YGeneration("Nikita Zvolenko");
        User angelika = new ZGeneration("Angelika Nutella");
        //When
        String johnUse = john.sharePost();
        System.out.println("John belongs to Millenials and " + johnUse);
        String nikitaUse = nikita.sharePost();
        System.out.println("Nikita belongs to YGeneration" + nikitaUse);
        String angelikaUse = angelika.sharePost();
        System.out.println("Angelika belongs to ZGeneration" + angelikaUse);
        //Then
        assertEquals("[TwitterPublisher] use Twitter",johnUse);
        assertEquals("[Facebook Publisher] use Facebook",nikitaUse);
        assertEquals("[SnapchatPublisher] use Snapchat",angelikaUse);

    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John Mills");
        //When
        String johnUse = john.sharePost();
        System.out.println("John belongs to Millenials and " + johnUse);
        john.setSharingStrategy(new SnapchatPublisher());
        johnUse = john.sharePost();
        System.out.println("John belongs to Millenials and now " + johnUse);
        //Then
        assertEquals("[SnapchatPublisher] use Snapchat",johnUse);
    }
}
