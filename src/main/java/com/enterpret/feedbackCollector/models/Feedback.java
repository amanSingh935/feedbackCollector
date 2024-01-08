package com.enterpret.feedbackCollector.models;

import com.enterpret.feedbackCollector.enums.FeedbackType;
import com.enterpret.feedbackCollector.enums.Source;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    public Tenant tenant;
    public Source source;
    public FeedbackType type;
}
