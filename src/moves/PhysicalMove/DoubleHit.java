package moves.PhysicalMove;

import ru.ifmo.se.pokemon.*;

public class DoubleHit extends PhysicalMove {

    public DoubleHit() {
        super(Type.NORMAL, 35,90);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
        super.applyOppDamage(def, damage);
    }

    @Override
    protected String describe() {
        return "совершает атаку " + getClass().getSimpleName();
    }

}
