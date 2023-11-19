package moves.StatusMove;

import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove {
    public Roost(){
        super(Type.FLYING, 0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.HP, (int)(-1 * (p.getStat(Stat.HP)/2)));
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "совершает атаку " + getClass().getSimpleName();
    }
}
