package chapter01.item02.builder.lombok;


public class BuilderTest {

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = NutritionFacts.builder(100).build();
        System.out.println("nutritionFacts = " + nutritionFacts);
    }
}
