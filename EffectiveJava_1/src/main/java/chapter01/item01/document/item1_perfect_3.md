## 완벽 공략 3. Interface 에 정적 메서드

자바 8 과 9 에서 주요 Interface 의 변화

* 기본 메서드 (default method) 와 정적 메서드를 가질 수 있다.
* `default method`
  * Interface 에서 메서드 선언 뿐 아니라, 기본적인 구현체까지 제공할 수 있다.
  * 기존의 Interface 를 구현하는 클래스에 새로운 기능을 추가할 수 있다.
  * `인스턴스를 만들어야만 호출할 수 있는 메서드를 제공하고 싶을때 사용`
* `static method`
  * 자바 9 부터 private 메서드 그리고 private static 메서드도 가질 수 있다.
  * 단, private 필드는 아직도 선언할 수 없다.
  * `인스턴스를 만들지 않고도 호출할 수 있는 메서드를 제공하고 싶을때 사용`

**질문 1) 내림차순으로 정렬하는 Comparator 를 만들고 List<Integer> 를 정렬하라**

**질문 2) 질문 1 에서 만든 Comparator 를 사용해서 오름차순으로 정렬하라**

```java
public class ListQuiz {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(44);
        numbers.add(20);
        numbers.add(100);
        numbers.add(3);

        System.out.println("numbers = " + numbers);

        Comparator<Integer> desc = (first, second) -> second - first;
        numbers.sort(desc);
        System.out.println(numbers);

        numbers.sort(desc.reversed());
        System.out.println(numbers);

    }
}
```

