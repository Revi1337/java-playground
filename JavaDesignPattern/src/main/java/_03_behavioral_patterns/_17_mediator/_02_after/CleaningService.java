package _03_behavioral_patterns._17_mediator._02_after;

public class CleaningService {

    private FrontDesk frontDesk = new FrontDesk();

    public void getTowel(Integer guestId, int numberOfTowel) {
        String roomNumber = this.frontDesk.getRoomNumberFor(guestId);
        System.out.println("Provide " + numberOfTowel + " to " + roomNumber);
    }

}
