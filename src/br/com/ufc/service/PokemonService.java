package br.com.ufc.service;

import java.util.Collection;
import java.util.Map.Entry;

import br.com.ufc.dao.PokemonDAO;
import br.com.ufc.model.Pokemon;

public class PokemonService {
    private PokemonDAO pkDAO;
    
    public PokemonService(PokemonDAO pkDAODatabase) {
    	this.pkDAO = pkDAODatabase;
    }
    public Collection<Entry<Integer,Pokemon>> listPokemons(){
    	return pkDAO.listAll();
    }
    public Pokemon searchPokemon(Integer id){
        return pkDAO.findOne(id);
    }
}
