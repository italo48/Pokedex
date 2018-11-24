package br.com.ufc.controller;

import br.com.ufc.service.PokemonService;
import br.com.ufc.view.PokedexUiResponse;

public class PokedexController {	
	private PokemonService pkService;
	private PokedexUiResponse pkUiResp = new PokedexUiResponse();
	
	public PokedexController(PokemonService pkServiceInject) {
		this.pkService = pkServiceInject;
	}
    public void leavePokedex() {
    	pkUiResp.messageBye();
    }
	public void listPokemons() {
		pkUiResp.showListPokemons(pkService.listPokemons());
	}
	public void showOnePokemon(Integer id) {
		pkUiResp.showOnePokemon(pkService.searchPokemon(id));
	}
}
