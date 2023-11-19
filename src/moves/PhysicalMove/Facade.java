package moves.PhysicalMove;

import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Status.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL,70,100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        if(def.getCondition() == BURN || def.getCondition() == POISON || def.getCondition() == PARALYZE) {
            super.applyOppDamage(def, damage*2);
            System.out.println("наносит double power удар");
        }
        else{
            super.applyOppDamage(def, damage);
        }
    }

    @Override
    protected String describe() {
        return "совершает атаку " + getClass().getSimpleName();
    }
}
