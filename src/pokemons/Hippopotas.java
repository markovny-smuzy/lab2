package pokemons;

import moves.PhysicalMove.Bulldoze;
import moves.PhysicalMove.Facade;
import moves.StatusMove.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Hippopotas extends Pokemon {
    public Hippopotas(String name, int level) {
        super(name, level);

        super.setType(Type.GROUND);
        super.setStats(68,72,78,38,42,32);

        super.setMove(new Swagger(), new Bulldoze(), new Facade());
    }
}
