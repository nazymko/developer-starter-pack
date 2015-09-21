package com.database.model.meta;

import org.springframework.data.annotation.Transient;

import java.time.Instant;

/**
 * Created by Nazymko on 9/17/2015.
 */
public class Meta {
    private Instant createdAt;
    private Instant savedAt;
    @Transient
    private Instant loadedAt;
    private Long id;

    /**
     * For new created contents
     */
    public Meta() {
        this.createdAt = Instant.now();
    }

    /**
     * For restoring from database
     */
    public Meta(Instant createdAt, Instant savedAt, Long id) {
        this.createdAt = createdAt;
        this.savedAt = savedAt;
        this.loadedAt = Instant.now();
        this.id = id;
    }

    public static Meta newMeta() {
        return new Meta();
    }

    public Long getId() {
        return id;
    }

    public Instant getLoadedAt() {
        return loadedAt;
    }

    public Instant getSavedAt() {
        return savedAt;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}
