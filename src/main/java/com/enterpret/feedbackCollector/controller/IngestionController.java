package com.enterpret.feedbackCollector.controller;

import com.enterpret.feedbackCollector.models.Feedback;
import com.enterpret.feedbackCollector.service.FeedbackFetcher;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/ingest")
@Slf4j
public class IngestionController {
    private static final Logger logger = LoggerFactory.getLogger(IngestionController.class);
    @Autowired
    FeedbackFetcher feedbackFetcher;

    @GetMapping()
    public ResponseEntity<Feedback> getFeedback(){
        try{
            feedbackFetcher.fetchFeedback();
        } catch (Exception e){
            logger.error("Could not fetch data due to : ", e);
        }

    }
}
