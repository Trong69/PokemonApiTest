package com.pokemonreview.api.controllers;

import com.pokemonreview.api.models.Pokemon;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class PokemonController {

    @GetMapping("pokemon")
    public ResponseEntity<List<Pokemon>> getPokemon (){
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1,"pikachu","electric"));
        pokemons.add(new Pokemon(2,"charmander","fire"));
        return ResponseEntity.ok(pokemons);
    }

    @GetMapping("pokemon/{id}")
    public Pokemon getPokemonDetail(@PathVariable int id){
        return new Pokemon(id,"rum","rock");
    }

   @PostMapping("pokemon/create")
   @ResponseStatus(HttpStatus.CREATED)
   public ResponseEntity<Pokemon> createPokemon (@RequestBody Pokemon pokemon){
        return new ResponseEntity<>(pokemon, HttpStatus.CREATED);
   }

   @PutMapping("pokemon/{id}/update")
    public ResponseEntity<Pokemon> updatePokemon (@PathVariable int id, @RequestBody Pokemon pokemon){
        return ResponseEntity.ok(pokemon);
   }

   @DeleteMapping("pokemon/{id}/delete")
    public ResponseEntity<String> deletePokemon (@PathVariable int id){
        return ResponseEntity.ok("Deleted");
    }
}
