package org.example;

public class WaterPokemon extends PokemonHandler{

    public WaterPokemon(String name) {
        super("Water", name);
    }

    /**
     *
     * @param attackType: The elemental type of the attack that is coming to our Pokemon
     * @return If the Pokemon resist the attack or if it passes to the next Pokemon
     */
    @Override
    public String handleAttack(String attackType) {
        if (attackType.equalsIgnoreCase(getResistanceType())) {
            return  getPokemonName() + " resist the water-type attack.";
        } else {
            return getPokemonName() + " pass the attack to the next Pokémon.\n" + super.handleAttack(attackType);
        }
    }
}
