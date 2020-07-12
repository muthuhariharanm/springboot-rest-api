package com.project.restapi.restapi.models;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "avgrating")
public class Avgrating {

    @Id
    @Column(name = "reviewee_email", nullable = false)
    private String reviewee_email;

    @Column(name = "avgrating")
    private BigDecimal avgrating;

    public Avgrating() {
    }

    public Avgrating(String reviewee_email, BigDecimal average) {
        this.reviewee_email = reviewee_email;
        this.avgrating = average;
    }

    public String getRevieweeEmail() {
        return reviewee_email;
    }

    public void setRevieweeEmail(String reviewee_email) {
        this.reviewee_email = reviewee_email;
    }


    public BigDecimal getAverage() {
        return avgrating;
    }

    public void setAverage(BigDecimal average) {
        this.avgrating = average;
    }


    // @Override
    // public String toString() {
    //     return "Advertisement [id=" + id + ", title=" + title + "]";
    // }
    
}