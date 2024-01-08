package com.enterpret.feedbackCollector.service;

import com.enterpret.feedbackCollector.models.Feedback;
import com.enterpret.feedbackCollector.utils.DiscourseUrlBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.RestTemplate;

@Component
public class DiscourseFeedbackFetcher implements FeedbackFetcher {

    @Autowired DiscourseUrlBuilder discourseUrlBuilder;
    private String buildDiscourseUrl(){
        if(discourseUrlBuilder.hasPagesLeft()){
            return discourseUrlBuilder.nextPage();
        }
        return "";
    }

    @Override
    public Feedback fetchFeedback() {
        Feedback feedback = new Feedback();
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.execute(buildDiscourseUrl(), HttpMethod.GET, RequestCallback);
    }

    @Override
    public void saveFeedback(Feedback feedback) {

    }
}
