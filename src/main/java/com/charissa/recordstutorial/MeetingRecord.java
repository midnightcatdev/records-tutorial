package com.charissa.recordstutorial;

public record MeetingRecord(String title) {
    public MeetingRecord {
        if (title.isBlank()) {
            throw new IllegalArgumentException("Titel mag niet leeg zijn");
        }
    }
}
