package moves.StatusMove;

import ru.ifmo.se.pokemon.*;

public class CosmicPower extends StatusMove {

    public CosmicPower() {
        super(Type.PSYCHIC, 0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.DEFENSE, 1);
        Effect e2 = new Effect().stat(Stat.SPECIAL_DEFENSE, 1);

        p.addEffect(e);
        p.addEffect(e2);
    }

    @Override
    protected String describe() {
        return "совершает атаку " + getClass().getSimpleName();
    }
}
