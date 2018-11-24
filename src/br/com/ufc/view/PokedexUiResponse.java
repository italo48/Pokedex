package br.com.ufc.view;

import java.util.Collection;
import java.util.Map.Entry;

import br.com.ufc.model.Pokemon;

public class PokedexUiResponse {
	public void showListPokemons(Collection<Entry<Integer,Pokemon>> pkList) {
        System.out.println("+-------------------------+");
        System.out.println("|        Pokemons         |");
        System.out.println("+-------------------------+");
        System.out.println("ID : Name : Type");
        for (Entry<Integer, Pokemon> pk : pkList) {
        	System.out.println(pk.getKey() + " - " + pk.getValue().getNome()  + " - " +  pk.getValue().getTipo());
//        	System.out.println("");
        }
	}
	public void showOnePokemon(Pokemon pk) {
        System.out.println("+-------------------------+");
        System.out.println("|        Pokemon          |");
        System.out.println("+-------------------------+");
        	System.out.println("Name: " + pk.getNome());
        	System.out.println("Type: " + pk.getTipo());
        	System.out.println("");		
	}
	public void messageBye() {
		System.out.println("See you late!!");
	}
}
