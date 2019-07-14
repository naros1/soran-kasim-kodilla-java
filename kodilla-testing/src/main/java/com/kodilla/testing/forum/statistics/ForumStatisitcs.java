package com.kodilla.testing.forum.statistics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForumStatisitcs
{
   Statistics statistics;

    private Map<String, Double> statisticsForum =new HashMap<String, Double>();


    public ForumStatisitcs(Statistics statistics) {
        this.statistics = statistics;


    }

    public int usersCount(){
        return statistics.usersNames().size();
    }

    public int postCount(){
        return statistics.postsCount();
    }
    public int commentsCount(){
        return statistics.commentsCount();
    }

    public Map<String, Double> calculateAdvStatistics(Statistics statistics){
        if (statistics.usersNames().size()>0) {
            Double averagePostOnUser =  ((double)statistics.postsCount() /(double) statistics.usersNames().size());
            statisticsForum.put("Average posts counted on user", averagePostOnUser);
        }else{
            statisticsForum.put("Average posts counted on user", 0.0);
        }

        if(statistics.usersNames().size()>0) {
            Double averageCommentsOnUser =  ((double)statistics.commentsCount() /(double) statistics.usersNames().size());
            statisticsForum.put("Average comments counted on user", averageCommentsOnUser);
        }else {
            statisticsForum.put("Average comments counted on user", 0.0);
        }

        if (statistics.postsCount()>0) {
            Double averageCommentsOnPost = ((double)statistics.commentsCount() / (double)statistics.postsCount());
            statisticsForum.put("Average comments counted on post", averageCommentsOnPost);
        }else{
            statisticsForum.put("Average comments counted on post", 0.0);
        }

        return statisticsForum;
    }

    public void showStatistics(){
        for(Map.Entry<String, Double> statistic :
                statisticsForum.entrySet()){
            System.out.println("Statistic : \"" + statistic.getKey() +"\" is : " + statistic.getValue());

        }
    }


}
