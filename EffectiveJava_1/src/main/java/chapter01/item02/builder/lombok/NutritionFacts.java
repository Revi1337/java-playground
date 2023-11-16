package chapter01.item02.builder.lombok;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

// Lombok 의 @Builder 로 만든 클래스에는 모든 필드가 채워진 생성자가 컴파일 시점에 생성된다.
// 하지만 이것은 @AllArgsConstructor(access = AccessLevel.PRIVATE) 를 설정해주면 생성자를 막을 수 있다.
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Builder
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    // Lombok @Builder 필수값 설정.
    // 빌더의 생성자를 통해 초기값을 세팅해준다.
    public static NutritionFactsBuilder builder(int calories) {
        return new NutritionFactsBuilder().calories(calories);
    }

}
