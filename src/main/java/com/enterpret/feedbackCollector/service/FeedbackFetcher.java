package com.enterpret.feedbackCollector.service;

import com.enterpret.feedbackCollector.models.Feedback;
import org.json.JSONObject;

public interface FeedbackFetcher {
    Feedback fetchFeedback();
    void saveFeedback(Feedback feedback);
}
