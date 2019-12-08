package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.ForumTopic;
import com.kodilla.patterns2.observer.forum.ForumUser;
import com.kodilla.patterns2.observer.forum.JavaHelpForumTopic;
import com.kodilla.patterns2.observer.forum.JavaToolsForumTopic;
import org.junit.Assert;
import org.junit.Test;

public class MentorTestSuite {
    @Test
    public void testUpdate()
    {
        //Given
        Mentor andrzejGalaz = new Mentor("Andrzej Gałąź");
        Mentor rychuPeja = new Mentor("Rychu Peja");
        HomeworkQue johnSmith = new HomeworkQue("John Smith");
        HomeworkQue  ivoneEscobar = new HomeworkQue("Ivone Escobar");
        HomeworkQue jessiePinkman = new HomeworkQue("Jessie Pinkman");
        johnSmith.registerObserver(andrzejGalaz);
        ivoneEscobar.registerObserver(andrzejGalaz);
        jessiePinkman.registerObserver(rychuPeja);
        //When
        johnSmith.addHomework("For, If , While");
        johnSmith.addHomework("Collection");
        ivoneEscobar.addHomework("Stream");
        ivoneEscobar.addHomework("Lambda");
        jessiePinkman.addHomework("Wiesz co się liczy ...");
        //Then
        Assert.assertEquals(4, andrzejGalaz.getUpdateCount() );
        Assert.assertEquals(1, rychuPeja.getUpdateCount());
    }
}
