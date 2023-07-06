package com.slut.pokemonsearch;

import com.beust.jcommander.JCommander;
import com.slut.pokemonsearch.api.APIPokemon;
import com.slut.pokemonsearch.cli.CLIArguments;
import com.slut.pokemonsearch.cli.CLIFunctions;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static com.slut.pokemonsearch.CommanderFunctions.buildCommanderWithName;
import static com.slut.pokemonsearch.CommanderFunctions.parseArguments;
import static com.slut.pokemonsearch.api.APIFunctions.buildAPI;

public class PokemonAbilitySearch {
    public static void main(String[] args) {
        JCommander jCommander = buildCommanderWithName("pokemon-ability-search", CLIArguments::newInstance);
        System.out.println("wepppp");
                                        // Transformar de la terminal a objetos de java
        Stream<CLIArguments> streamOfCLI =
                parseArguments(jCommander, args, JCommander::usage)
                .orElse(Collections.emptyList())
                .stream().map(obj -> (CLIArguments) obj); // Se obtiene cada objeto del stream que en ese punto
                                                          // Es un stream de objects y lo convierte a cada elemento
                                                          // En CLIArguments
        Optional<CLIArguments> cliArgumentsOptional =
                streamOfCLI.filter(cli -> !cli.isHelp())
                .filter(cli-> cli.getKeyword() != null)
                .findFirst();
        cliArgumentsOptional.map(CLIFunctions:: toMap)
                .map(PokemonAbilitySearch::executeRequest)
                .orElse(Stream.empty())
                .forEach(System.out::println);
    }
    private static Stream<PokemonAbility> executeRequest(Map<String, Object> params){
        APIPokemon api = buildAPI(APIPokemon.class, "https://pokeapi.co/api/v2");
        return Stream.of(params).map(api::pokemon)
                .flatMap(Collection::stream);
    }
}
