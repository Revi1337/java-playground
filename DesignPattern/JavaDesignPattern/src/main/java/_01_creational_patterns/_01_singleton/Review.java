package _01_creational_patterns._01_singleton;


public class Review {

    public static void main(String[] args) {
        ReviewSettings instance = ReviewSettings.getInstance();
        ReviewSettings instance1 = ReviewSettings.getInstance();
        System.out.println(instance1 == instance);
    }
}

class ReviewSettings {

    private ReviewSettings() {}

    public static ReviewSettings getInstance() {
        return ReviewSettingsHolder.INSTANCE;
    }

    private static class ReviewSettingsHolder {
        private static final ReviewSettings INSTANCE = new ReviewSettings();
    }

}
