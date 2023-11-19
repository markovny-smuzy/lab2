package moves.StatusMove;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect sleep = new Effect().condition(Status.SLEEP).turns(2).stat(Stat.HP, 100);
        p.addEffect(sleep);
    }

    @Override
    protected String describe() {
        return "совершает атаку " + getClass().getSimpleName();
    }
}

