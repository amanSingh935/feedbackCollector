package com.enterpret.feedbackCollector.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DiscourseUrlBuilder implements UrlBuilder{

    private Integer totalPages;
    private Integer currentPage;
    private String clientId;

    @Value("endpoint.discourse.url")
    public String discourseEndpoint;

    public DiscourseUrlBuilder(String clientId, String type, Integer pages){
        totalPages = pages;
        currentPage = 1;
    }

    String buildDefaultUrl(){
        return discourseEndpoint + clientId + currentPage;
    }

    @Override
    public String buildUrl() {
        return buildDefaultUrl();
    }

    @Override
    public String nextPage() {
        return null;
    }

    @Override
    public Boolean hasPagesLeft() {
        return true;
    }
}
