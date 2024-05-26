package cp1_strategy.self.after;

public class Sniper extends Soldier {

    public Sniper() {
        setMoveStrategy(new MoveTurnelStrategy());
        setAttackStrategy(new SniperStrategy());
    }
}
