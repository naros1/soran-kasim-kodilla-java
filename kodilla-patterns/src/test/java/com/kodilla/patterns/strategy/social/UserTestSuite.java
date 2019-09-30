package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User steven = new ZGeneration("Steven");
        User john = new YGeneration("John");
        User anna = new Millenials("Anna");

        //When
        String stevenShare = steven.sharePost();
        System.out.println("Steven share : " + stevenShare);
        String johnShare = john.sharePost();
        System.out.println("John share: " + johnShare);
        String annaShare = anna.sharePost();
        System.out.println("Anna share: " + annaShare);

        //Then
        Assert.assertEquals("Sharing by Twitter !", stevenShare);
        Assert.assertEquals("Sharing by Facebook !", johnShare);
        Assert.assertEquals("Sharing by Snapchat !", annaShare);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User steven = new ZGeneration("Steven");

        //When
        String stevenShare = steven.sharePost();
        System.out.println("Steven share: " + stevenShare);
        steven.setSocialPublisher(new SnapchatPublisher());
        stevenShare = steven.sharePost();
        System.out.println("Steven now share: " + stevenShare);

        //Then
        Assert.assertEquals("Sharing by Snapchat !", stevenShare);
    }
}
