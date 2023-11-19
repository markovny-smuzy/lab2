package pokemons;

import moves.StatusMove.Roost;
import ru.ifmo.se.pokemon.Type;

public class Hydreigon extends Zweilous{
    public Hydreigon(String name, int level){
        super(name, level);

        super.setType(Type.DARK,Type.DRAGON);
        super.setStats(92,105,90,125,90,98);

        super.setMove(new Roost());
    }
}
