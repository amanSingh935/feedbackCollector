package com.enterpret.feedbackCollector.enums;

public enum FeedbackType {
    COMMENT("Comment"), REVIEW("Review"), POST("Post");

    public final String name;
    private FeedbackType(String name){
        this.name = name;
    }
}
