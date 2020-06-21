package com.gaby.web.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokedex pokedex = new Pokedex();
		Pokemon Pikachu = pokedex.createPokemon("Pikachu", 100, "Electrico");
		Pokemon Evee = pokedex.createPokemon("Evee", 80, "Normal");
		
		Pikachu.attackPokemon(Evee);
		pokedex.listPokemon();
	}

}
