package com.personal.vetapi.model.testimonial;

import com.personal.vetapi.model.user.User;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Testimonial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long testimonialId;

    @Column(nullable = false)
    private String message;

    @ManyToOne
    private User creator;

    @CreationTimestamp
    private LocalDateTime creationTimeStamp;
    @UpdateTimestamp
    private LocalDateTime updateTimeStamp;

    public Testimonial() {};

    public Testimonial(String message, LocalDateTime creationTimeStamp, LocalDateTime updateTimeStamp, User creator) {
        this.message = message;
        this.creationTimeStamp = creationTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.creator = creator;
    };

    public String getMessage() {
        return message;
    };

    public Testimonial setMessage(String message) {
        this.message = message;
        return this;
    };

    public LocalDateTime getCreationTimeStamp() {
        return creationTimeStamp;
    };

    public LocalDateTime getUpdateTimeStamp() {
        return updateTimeStamp;
    };

    public Testimonial setUpdateTimeStamp(LocalDateTime updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
        return this;
    };

    public User getCreator() {
        return creator;
    };

    public Testimonial setCreator(User creator) {
        this.creator = creator;
        return this;
    };
};
