package br.com.ufc.view;

public class PokedexUiRequest {
    public void initMenu(){
        System.out.println("+------------------------+");
        System.out.println("|        Pokedex         |");
        System.out.println("+------------------------+");
        System.out.println("0 - Exit");
        System.out.println("1 - To list all Pokemons");
        System.out.println("2 - To search a Pokemon");
        System.out.print(">>: ");
    }
    public void askId() {
    	System.out.print("What is the pokemon id? ");
    }
}
