package com.charissa.recordstutorial;

public class Meeting {

    private String title;

    public Meeting(String je_moeder_ophalen){
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return "Meeting{ " +
                "title " + title +
                '}';

    }
}

