package moves.SpecialMove;

import ru.ifmo.se.pokemon.*;

public class DragonRage extends SpecialMove {
    public DragonRage(){
        super(Type.DRAGON, 0,100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def, 40);
    }

    @Override
    protected String describe() {
        return "совершает атаку " + getClass().getSimpleName();
    }
}
