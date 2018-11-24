package br.com.ufc.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

import br.com.ufc.model.Pokemon;

public class PokemonDAO {
    HashMap<Integer, Pokemon> pokemonDatabase = new HashMap<>();

    public Collection<Entry<Integer,Pokemon>> listAll() {
        return pokemonDatabase.entrySet();
    }
    public Pokemon findOne(Integer id) {
        return pokemonDatabase.get(id);
    }
    public void populateDatabase() {
        Pokemon pk1  = new Pokemon("Pikachu", "Raio");
        Pokemon pk2  = new Pokemon("Charizard", "Fogo");
        Pokemon pk3  = new Pokemon("Bubasauro", "Planta");
        Pokemon pk4  = new Pokemon("Odish", "Planta");
        Pokemon pk5  = new Pokemon("Raichu", "Raio");
        Pokemon pk6  = new Pokemon("Abracadabra", "Psycho");
        Pokemon pk7  = new Pokemon("Meowth", "Dark");
        Pokemon pk8  = new Pokemon("Umbreon", "Dark");
        Pokemon pk9  = new Pokemon("Alolan", "Dark");
        Pokemon pk10 = new Pokemon("Darkrai", "Dark");

        pokemonDatabase.put(1 , pk1);
        pokemonDatabase.put(2 , pk2);
        pokemonDatabase.put(3 , pk3);
        pokemonDatabase.put(4 , pk4);
        pokemonDatabase.put(5 , pk5);
        pokemonDatabase.put(6 , pk6);
        pokemonDatabase.put(7 , pk7);
        pokemonDatabase.put(8 , pk8);
        pokemonDatabase.put(9 , pk9);
        pokemonDatabase.put(10 , pk10);
    }
}
