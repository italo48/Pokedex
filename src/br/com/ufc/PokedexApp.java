package br.com.ufc;

import java.util.Scanner;

import br.com.ufc.controller.PokedexController;
import br.com.ufc.dao.PokemonDAO;
import br.com.ufc.service.PokemonService;
import br.com.ufc.view.PokedexUiRequest;

public class PokedexApp {
	private int op;
	private int id;
	private Scanner in;
	private PokemonDAO pkDAO;
	private PokemonService pkService;
    	private PokedexUiRequest pkUiRequest;
    	private PokedexController pkController;

    public void pokedexStart(){
    	pkDAO = new PokemonDAO();
    	pkDAO.populateDatabase();
    	
    	pkService = new PokemonService(pkDAO);
    	
    	pkController = new PokedexController(pkService);
    	
    	pkUiRequest = new PokedexUiRequest();
    	in = new Scanner(System.in);
    	
    	while(true) {
    		pkUiRequest.initMenu();
            op = in.nextInt();
            if(op == 0) {
            	pkController.leavePokedex();
            	System.exit(0);
            }
            if(op == 1) {
            	pkController.listPokemons();
            }
            if(op == 2) {
            	pkUiRequest.askId();
            	id = in.nextInt();
            	pkController.showOnePokemon(id);
            }	
    	}
    }
}
