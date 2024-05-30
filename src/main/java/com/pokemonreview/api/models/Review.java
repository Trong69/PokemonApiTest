package com.pokemonreview.api.models;

import lombok.Data;

@Data
public class Review {
    private int id;
    private String title;
    private String content;
    private int start;

    public Review(int id, String title, String content, int start) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.start = start;
    }
}
