import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Solrock p1 = new Solrock("Solrock", 1);
        Hippopotas p2 = new Hippopotas("Hippopotas", 1);
        Hippowdon p3 = new Hippowdon("Hippowdon", 1);
        Deino p4 = new Deino("Deino", 1);
        Zweilous p5 = new Zweilous("Zweilous", 1);
        Hydreigon p6 = new Hydreigon("Hydreigon", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }

}
