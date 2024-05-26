package cp1_strategy.self.after;

public class MoveRoadStrategy implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("지상으로 이동합니다");
    }
}
