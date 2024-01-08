package com.enterpret.feedbackCollector.utils;

public interface UrlBuilder {
    String buildUrl();
    String nextPage();
    Boolean hasPagesLeft();
}
