package com.pokemonreview.api.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Review {
    private int id;
    private String title;
    private String content;
    private int start;

//    public Review(int id, String title, String content, int start) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//        this.start = start;
//    }
}
