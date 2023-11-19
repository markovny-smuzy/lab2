package pokemons;

import moves.PhysicalMove.StoneEdge;
import ru.ifmo.se.pokemon.Type;

public class Hippowdon extends Hippopotas {
    public Hippowdon(String name, int level){
        super(name, level);

        super.setType(Type.GROUND);
        super.setStats(108,112,118,68,72,47);

        super.setMove(new StoneEdge());
    }
}
