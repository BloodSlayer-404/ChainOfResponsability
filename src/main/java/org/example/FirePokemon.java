package org.example;

public class FirePokemon extends PokemonHandler{

    public FirePokemon(String name) {
        super("Fire", name);
    }

    /**
     *
     * @param attackType: The elemental type of the attack that is coming to our Pokemon
     * @return If the Pokemon resist the attack or if it passes to the next Pokemon
     */
    @Override
    public String handleAttack(String attackType) {
        if (attackType.equalsIgnoreCase(getResistanceType())) {
            return getPokemonName() + " resist the fire-type attack.";
        } else {
            return getPokemonName() + " pass the attack to the next Pokémon.\n" + super.handleAttack(attackType);
        }
    }


}
