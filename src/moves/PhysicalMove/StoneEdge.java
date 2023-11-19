package moves.PhysicalMove;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge(){
        super(Type.ROCK, 100,80);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        if (att.getStat(Stat.SPEED) * 8.0D > Math.random()) {
            System.out.println("Critical Hit!");
            return 2.0D;
        } else {
            return 1.0D;
        }
    }

    @Override
    protected String describe() {
        return "совершает атаку " + getClass().getSimpleName();
    }
}
