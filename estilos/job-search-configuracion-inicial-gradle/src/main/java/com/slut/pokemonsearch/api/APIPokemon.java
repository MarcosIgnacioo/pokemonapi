package com.slut.pokemonsearch.api;

import com.slut.pokemonsearch.PokemonAbility;
import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

@Headers("Accept: application/json")
public interface APIPokemon {
    @RequestLine("GET /ability/stench") // Corrige la anotación @RequestLine
    List<PokemonAbility> pokemon(@QueryMap Map<String, Object> queryMap);
}
