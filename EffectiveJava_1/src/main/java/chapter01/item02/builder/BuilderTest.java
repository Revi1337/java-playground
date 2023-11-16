package chapter01.item02.builder;

public class BuilderTest {

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(10, 10)
                .calories(10)
                .build();
        System.out.println("nutritionFacts = " + nutritionFacts);
    }
}
