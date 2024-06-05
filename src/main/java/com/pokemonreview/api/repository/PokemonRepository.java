package com.pokemonreview.api.repository;

import com.pokemonreview.api.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

    //interface to interact with db, using JpaRepository
    //when talking to db, it needs to know what are we what data type we are getting
    //and the type of primary key belong to that data type (we are getting pokemon data and the primary key type is int)
    //(type of primary key here has to be the type In Hoa)

}
