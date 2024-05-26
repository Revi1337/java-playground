package cp1_strategy.self.after;

    public class Client {

        public static void main(String[] args) {
            Marin marin = new Marin();
            marin.move();
            marin.attack();
            System.out.println();

            marin.setAttackStrategy(new GunStrategy());
            marin.setMoveStrategy(new MoveSkyStrategy());
            marin.move();
            marin.attack();
            System.out.println();

            Sniper sniper = new Sniper();
            sniper.move();
            sniper.attack();
        }
    }
