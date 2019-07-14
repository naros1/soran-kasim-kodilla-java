package com.kodilla.testing.forum.statistics.mock;

import com.kodilla.testing.forum.statistics.ForumStatisitcs;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testForumStatisticNoneWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();
        int postsValue = 0;
        int commentsValue = 0;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsValue);
        when(statisticsMock.commentsCount()).thenReturn(commentsValue);

        ForumStatisitcs forumStatistics = new ForumStatisitcs(statisticsMock);

        //When
        Map averageValues = forumStatistics.calculateAdvStatistics(statisticsMock);
        Double postsPerUser = (Double) averageValues.get("Average posts counted on user");
        Double commentsPerUser =(Double) averageValues.get("Average comments counted on user");
        Double commentsPerPost = (Double) averageValues.get("Average comments counted on post");

        //Then
        Assert.assertEquals(0.0, postsPerUser, 0.00001);
        Assert.assertEquals(0.0, commentsPerUser, 0.00001);
        Assert.assertEquals(0.0, commentsPerPost, 0.00001);

    }

    @Test
    public void testForumStatistic1000And100UsersPostsWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();
        for(int i = 0; i <100; i ++){
            users.add("User" + i);
        }

        int postsValue = 1000;
        int commentsValue = 0;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsValue);
        when(statisticsMock.commentsCount()).thenReturn(commentsValue);

        ForumStatisitcs forumStatistics = new ForumStatisitcs(statisticsMock);

        //When
        Map averageValues = forumStatistics.calculateAdvStatistics(statisticsMock);
        Double postsPerUser = (Double) averageValues.get("Average posts counted on user");
        Double commentsPerUser =(Double) averageValues.get("Average comments counted on user");
        Double commentsPerPost = (Double) averageValues.get("Average comments counted on post");

        //Then
        Assert.assertEquals(10.0, postsPerUser, 0.00001);
        Assert.assertEquals(0.0, commentsPerUser, 0.00001);
        Assert.assertEquals(0.0, commentsPerPost, 0.00001);

    }

    @Test
    public void testForumStatisticCountCommentsBiggerThanPostsAnd100UsersWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();
        for(int i = 0; i <100; i ++){
            users.add("User" + i);
        }

        int postsValue = 1000;
        int commentsValue = 2000;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsValue);
        when(statisticsMock.commentsCount()).thenReturn(commentsValue);

        ForumStatisitcs forumStatistics = new ForumStatisitcs(statisticsMock);

        //When
        Map averageValues = forumStatistics.calculateAdvStatistics(statisticsMock);
        Double postsPerUser = (Double) averageValues.get("Average posts counted on user");
        Double commentsPerUser =(Double) averageValues.get("Average comments counted on user");
        Double commentsPerPost = (Double) averageValues.get("Average comments counted on post");

        //Then
        Assert.assertEquals(10.0, postsPerUser, 0.00001);
        Assert.assertEquals(20.0, commentsPerUser, 0.00001);
        Assert.assertEquals(2.0, commentsPerPost, 0.00001);

    }

    @Test
    public void testForumStatisticCountCommentsLowerThanPostsAnd100UsersWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();
        for(int i = 0; i <100; i ++){
            users.add("User" + i);
        }

        int postsValue = 2000;
        int commentsValue = 1000;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsValue);
        when(statisticsMock.commentsCount()).thenReturn(commentsValue);

        ForumStatisitcs forumStatistics = new ForumStatisitcs(statisticsMock);

        //When
        Map averageValues = forumStatistics.calculateAdvStatistics(statisticsMock);
        Double postsPerUser = (Double) averageValues.get("Average posts counted on user");
        Double commentsPerUser =(Double) averageValues.get("Average comments counted on user");
        Double commentsPerPost = (Double) averageValues.get("Average comments counted on post");

        //Then
        Assert.assertEquals(20.0, postsPerUser, 0.00001);
        Assert.assertEquals(10.0, commentsPerUser, 0.00001);
        Assert.assertEquals(0.5, commentsPerPost, 0.00001);

    }
}
