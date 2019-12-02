package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuit {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new YGeneration("Steven Links");
        User john = new ZGeneration("John Hemerald");
        User ania = new Millenials("Ania Frania");

        //When
        String stevenPublish = steven.sharePost();
        System.out.println("Steven publish: " + stevenPublish);
        String johnPublish = john.sharePost();
        System.out.println("John publish: " + johnPublish);
        String aniaPublish = ania.sharePost();
        System.out.println("Ania publish: " + aniaPublish);

        //Then
        Assert.assertEquals("I am using Twitter to share my life with social", stevenPublish);
        Assert.assertEquals("I am using Facebook to share my life with social", johnPublish);
        Assert.assertEquals("I am using Snapchat to share my life with social", aniaPublish);
    }

    @Test
    public void testIndividualInvestingStrategy() {
        //Given
        User steven = new YGeneration("Steven Links");

        //When
        String stevenPublish = steven.sharePost();
        System.out.println("Steven publish: " + stevenPublish);
        steven.setNewMediaPortal(new  SnapchatPublisher());
        stevenPublish = steven.sharePost();
        System.out.println("Steven now should: " + stevenPublish);

        //Then
        Assert.assertEquals("I am using Snapchat to share my life with social", stevenPublish);
    }
}