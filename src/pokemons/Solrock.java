package pokemons;

import moves.PhysicalMove.Bulldoze;
import moves.StatusMove.CosmicPower;
import moves.StatusMove.Rest;
import moves.StatusMove.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Solrock extends Pokemon {

    public Solrock(String name, int level) {
        super(name, level);

        super.setType(Type.ROCK, Type.PSYCHIC);
        super.setStats(90, 95, 85, 55, 65, 70);

        super.setMove(new Swagger(), new CosmicPower(), new Rest(), new Bulldoze());
    }


}
