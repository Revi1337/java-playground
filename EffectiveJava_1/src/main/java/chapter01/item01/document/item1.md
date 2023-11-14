### Item 1. 생성자 대신 정적 팩토리 메서드를 고려하라

#### 장점

* 이름을 가질 수 있다. (동일한 메서드 시그리처의 생성자를 두개 가질 수 없다.)
* 호출될 때마다 인스턴스를 새로 생성하지 않아도 된다. (Boolean.valueOf)
* 반환 타입의 하위 타입 객체를 반환할 수 있는 능력이 있다. (Interface 기반 프레임워크, Interface 에 정적 메서드)
* 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.
* 정적 팩토리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다. (서비스 제공자 프레임워크) 
* 디자인패턴의 추상팩토리 패턴, 팩토리메서드 패턴 등과 전혀 관련 없다.

#### 단점

* 상속을 하려면 public 이나 protected 가 필요하기 때문에 정적 팩토리 메서드만 제공
* 정적 패토리 메서드를 프로그래머가 찾기 어렵다.

#### 정적 팩터리 메서드에서 흔히 사용하는 Naming 방식

* `from` : 매개변수를 하나 받아서 해당 타입의 인스턴스를 반환하는 형변환 메서드
: `Date d = Date.from(instant);`

* `of` : 여러 매개변수를 받아 적합한 타입의 인스턴스를 반환하는 집계 메서드
: `Set<Rank> faceCards = EnumSet.of(JACK, QUEEN, KING);`

* `valueOf` : from 과 of 의 더 자세한 버전
: `BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);`

* `instance` 혹은 `getInstance` : (매개변수를 받는다면) 매개변수로 명시한 인스턴스를 반환하지만, 같은 인스턴스임을 보장하지는 않는다.
: `StackWalker luke = StackWalker.getInstance(options);`

* `create` 혹은 `newInstance` : instance 혹은 getInstance 와 같지만, 매번 새로운 인스턴스를 생성해 반환함을 보장한다.
: `Object newArray = Array.newInstance(classObject, arrayLen);`

* `getType` : getInstance 와 같으나, 생성할 클래스가 아닌 다른 클래스에 팩터리 메서드를 정의할 때 쓴다. "Type" 은 팩터리 메서드가 반환할 객체의 타입이다.
: `FileStore fs = Files.getFileStore(path);`

* `newType` : newInstance 와 같으나, 생성할 클래스가 아닌 다른 클래스에 팩터리 메서드를 정의할 때 쓴다. "Type" 은 팩터리 메서드가 반환할 객체의 타입이다.
: `BufferedReader br = Files.newBufferedReader(path);`

* `type` : getType 와 newType 의 간결한 버전
: `List<COmplaint> litany = Collections.list(legacyLitany);`

#### 정리

> 정적 팩터리 메서드와 public 생성자는 각자의 쓰임새가 있으니 상대적인 장단점을 이해하고 사용하는 것이 좋다.
그렇다고 하더라도 정적 팩터리 메서드를 사용하는게 유리한 경우가 더 많으므로 무작정 public 생성자를 제공하던 습관이 있다면 고치자.