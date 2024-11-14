package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonHandlerTest {

    PokemonHandler charmander = new FirePokemon("Charmander");
    PokemonHandler squirtle = new WaterPokemon("Squirtle");
    PokemonHandler bulbasaur = new GrassPokemon("Bulbasaur");

    /**
     * Check if the chain of responsibility is working, checking if each Pokemon of
     * the chain handle the attacks that it need to handle
     */
    @Test
    void handlerTest(){
        charmander.setNextHandler(squirtle);
        squirtle.setNextHandler(bulbasaur);

        assertEquals("Charmander resist the fire-type attack.",
                charmander.handleAttack("Fire"));


        assertEquals("Charmander pass the attack to the next Pokémon.\n" +
                        "Squirtle resist the water-type attack.",
                charmander.handleAttack("Water"));


        assertEquals("Charmander pass the attack to the next Pokémon.\n" +
                        "Squirtle pass the attack to the next Pokémon.\n" +
                        "Bulbasaur resist the grass-type attack.",
                charmander.handleAttack("Grass"));


        assertEquals("Charmander pass the attack to the next Pokémon.\n" +
                        "Squirtle pass the attack to the next Pokémon.\n" +
                        "Bulbasaur pass the attack to the next Pokémon.\n" +
                        "No pokemon can handle the Electric attack.",
                charmander.handleAttack("Electric"));

    }

}