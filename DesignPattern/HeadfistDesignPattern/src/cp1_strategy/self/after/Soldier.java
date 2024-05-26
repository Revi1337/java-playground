package cp1_strategy.self.after;

public abstract class Soldier {

    private AttackStrategy attackStrategy;
    private MoveStrategy moveStrategy;

    public Soldier() {
        this.attackStrategy = new GunStrategy();
        this.moveStrategy = new MoveRoadStrategy();
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void attack() {
        this.attackStrategy.attack();
    }

    public void move() {
        this.moveStrategy.move();
    }
}
