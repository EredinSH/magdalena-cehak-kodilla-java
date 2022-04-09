package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class HomeworkList implements Checked {

    private final List<Marker> markers;
    private final Deque<String> homeworks;
    private final String module;

    public HomeworkList (String module) {
        markers = new ArrayList<>();
        homeworks = new ArrayDeque<>();
        this.module = module;
    }

    public void addHomework(String homework) {
        homeworks.offer(homework);
        notifyMarker();
    }

    @Override
    public void registerMarker(Marker marker) {
        markers.add(marker);
    }

    @Override
    public void notifyMarker(){
        for (Marker marker : markers) {
            marker.update(this);
        }
    }

    @Override
    public void removeMarker(Marker marker){
        markers.remove(marker);
    }

    public Deque<String> getHomeworks() {
        return homeworks;
    }

    public String getModule() {
        return module;
    }

}
