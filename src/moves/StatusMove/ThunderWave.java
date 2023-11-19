package moves.StatusMove;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
    public ThunderWave(){
        super(Type.ELECTRIC, 0,90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.paralyze(p);

        Effect at = new Effect().chance(0.25).turns(1).stat(Stat.ATTACK, 0);
        p.addEffect(at);

        Effect speed = new Effect().chance(0.5).turns(1).stat(Stat.SPEED, (int)(-1 * (p.getStat(Stat.SPEED)/2)));
        p.addEffect(speed);
    }

    @Override
    protected String describe() {
        return "совершает атаку " + getClass().getSimpleName();
    }
}
