package com.enterpret.feedbackCollector.enums;

public enum Source {
    GOOGLE_PLAY_STORE("Google Play Store"),
    INTERCOM("Intercom"),
    TWITTER("Twitter"),
    DISCOURSE("Discourse");

    public final String name;
    private Source(String name) {
        this.name = name;
    }
}
