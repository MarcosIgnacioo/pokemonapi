package com.slut.pokemonsearch;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class PokemonAbility {
    int id;
    String name;
    @SerializedName("is_main_series")
    boolean isMainSeries;
    int generation;
    List<String> names;
    
    @SerializedName("effect_entries")
    List<String> effectEntries;
    @SerializedName("effect_changes")
    List<String> effectChanges;
    @SerializedName("flavor_text_entries")
    List<String> flavorTextEntries;
    List<String> pokemon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMainSeries() {
        return isMainSeries;
    }

    public void setMainSeries(boolean mainSeries) {
        isMainSeries = mainSeries;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<String> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<String> effectEntries) {
        this.effectEntries = effectEntries;
    }

    public List<String> getEffectChanges() {
        return effectChanges;
    }

    public void setEffectChanges(List<String> effectChanges) {
        this.effectChanges = effectChanges;
    }

    public List<String> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(List<String> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    public List<String> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<String> pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PokemonAbility that = (PokemonAbility) o;
        return id == that.id && isMainSeries == that.isMainSeries && generation == that.generation && Objects.equals(name, that.name) && Objects.equals(names, that.names) && Objects.equals(effectEntries, that.effectEntries) && Objects.equals(effectChanges, that.effectChanges) && Objects.equals(flavorTextEntries, that.flavorTextEntries) && Objects.equals(pokemon, that.pokemon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isMainSeries, generation, names, effectEntries, effectChanges, flavorTextEntries, pokemon);
    }

    @Override
    public String toString() {
        return "PokemonAbility{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isMainSeries=" + isMainSeries +
                ", generation=" + generation +
                ", names=" + names +
                ", effectEntries=" + effectEntries +
                ", effectChanges=" + effectChanges +
                ", flavorTextEntries=" + flavorTextEntries +
                ", pokemon=" + pokemon +
                '}';
    }
}
