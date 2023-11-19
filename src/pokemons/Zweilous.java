package pokemons;

import moves.PhysicalMove.DoubleHit;
import ru.ifmo.se.pokemon.Type;

public class Zweilous extends Deino{
    public Zweilous(String name, int level) {
        super(name, level);

        super.setType(Type.DARK, Type.DRAGON);
        super.setStats(72,85,70,65,70,58);

        super.setMove(new DoubleHit());
    }
}
