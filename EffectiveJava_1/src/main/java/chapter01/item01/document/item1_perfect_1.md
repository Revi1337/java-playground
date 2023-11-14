## 완벽 공략 1. Enum 타입

* 상수 목록을 담을 수 있는 데이터 타입
* 특정한 변수가 가질 수 있는 값을 제한할 수 있다. `Type-Safty` 를 보장할 수 있다.
* `Singleton 패턴`을 구현할 때 사용하기도 한다.

**질문 1) 특정 Enum 타입이 가질 수 있는 모든 값을 순회하며 출력하라**
: `Arrays.stream(OrderStatus.values()).forEach(System.out::println);`

**질문 2) Enum 은 자바의 클래스처럼 생성자 메서드, 필드를 가질 수 있는가?**
: ㅇㅇ

**질문 3) enum 의 값은 == 연산자로 동일성을 비교할 수 있는가?**
: ㅇㅇ `==` 로 하는것이 좋음. `equals()` 는 null 인 값에 사용하면 `NPE` 가 터진다.
결론은 `==` 를 사용하면 `null` 을 피할 수 있다.

**과제) Enum 을 key 로 사용하는 Map 을 정의하세요. 또는 Enum 을 담고 있는 Set 를 만들어보세요**

### EnumSet

* 열거형 상수를 사용하여 집합(Set)을 구현체
* Set의 특성상 중복된 원소를 허용하지 않음.
* EnumSet은 내부적으로 비트 벡터로 구현되어 있어 매우 효율적이고 작은 메모리를 사용.
* 비트연산을 통해 집합 연산을 매우 빠르게 수행

```java
public class App {
    
    public static void main(String[] args) {
        EnumSet<OrderStatus> orderStatuses = EnumSet.allOf(OrderStatus.class);
        System.out.println("orderStatuses = " + orderStatuses);
    }
}
```

### EnumMap

* 열거형 상수를 Key로 사용하는 Map의 구현체.
* 열거형 상수 값을 키로 사용할 수 있고, 그 상수 마다 고유한 value를 매핑하여 사용한다.
* EnumMap은 내부적으로 배열로 구현되어 있어, 매우 빠른 성능을 제공
* 특히 다른 맵보다 메모리 사용량이 적다.

```java
public class App {

    static EnumMap<OrderStatus, String> orderStatusObjectEnumMap = new EnumMap<>(OrderStatus.class) {
        {
            put(PREPARING, "준비중");
            put(SHIPPED, "출고완료");
            put(DELIVERING, "배송중");
            put(DELIVERED, "배송완료");
        }
    };

    public static void main(String[] args) {
        orderStatusObjectEnumMap.forEach(((key, value) -> System.out.println(key + " " + value)));
    }
    
}
```
