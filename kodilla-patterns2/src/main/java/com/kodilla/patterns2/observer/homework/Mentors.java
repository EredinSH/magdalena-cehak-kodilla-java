package com.kodilla.patterns2.observer.homework;

public class Mentors implements Marker {

    private final String mentorName;
    private int updateCount;

    public Mentors(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(HomeworkList homeworkList) {
        System.out.println(mentorName + ": New homework to be checked from - " + homeworkList.getModule() + "\n" +
                " (total: " + homeworkList.getHomeworks().size() + "homeworks)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

}
