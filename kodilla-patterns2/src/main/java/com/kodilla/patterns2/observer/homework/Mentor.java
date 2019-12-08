package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkQue homeworkQue) {
        System.out.println(name + ": New homework to check from student " + homeworkQue.getStudentName() + "\n" +
                " (total: " + homeworkQue.getHomeworks().size() + "homeworks");
        updateCount ++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
