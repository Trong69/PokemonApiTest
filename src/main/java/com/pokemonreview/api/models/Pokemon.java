package com.pokemonreview.api.models;

import lombok.Data;

@Data
public class Pokemon {
    private int id;
    private String name;
    private String type;

    public Pokemon(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
}
