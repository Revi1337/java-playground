package _03_behavioral_patterns._17_mediator._01_before;

public class CleaningService {

    public void clean(Gym gym) {
        System.out.println("Clean " + gym);
    }

    public void clean(Restaurant restaurant) {
        System.out.println("Clean " + restaurant);
    }

    public void getTowel(Guest guest, int numberOfTowel) {
        System.out.println(numberOfTowel + " towels to " + guest);
    }

}
