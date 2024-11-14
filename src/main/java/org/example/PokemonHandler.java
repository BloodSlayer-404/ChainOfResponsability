package org.example;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public abstract class PokemonHandler {
    @Setter
    protected PokemonHandler nextHandler;
    @Getter
    private final String resistanceType;
    @Getter
    private final String pokemonName;

    /**
     * Checks if a Pokemon can resist an attack based on its type
     * @param attackType: The elemental type of the attack that is coming to our Pokemon
     * @return A chaing of steps checking which Pokemon can resist the type of
     * the attack that is coming
     */
    public String handleAttack(String attackType) {
        if (nextHandler != null) {
            return nextHandler.handleAttack(attackType);
        }
        return "No pokemon can handle the " + attackType + " attack.";
    }
}
