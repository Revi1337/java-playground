### 어댑터 패턴

* 구조적인 디자인패턴 중 하나. 상이한 Interface 2개를 연결하는것이 목표.
* 기존 코드를 Client 가 사용하는 Interface 의 구현체로 바꿔주는 패턴.
* Client 가 사용하는 Interface 를 따르지 않는 기존 코드를 재사용할 수 있게 해준다.

#### 장점

* 기존의 코드를 변경하지 않고 원하는 Interface 의 구현체를 만들어 재사용할 수 있다. (`OCP` 를 지킬 수 있음.)
* 기존 코드가 하던 일과 특정 Interface 구현체로 변환하는 작업을 각기 다른 클래스로 분리하여 관리할 수 있다. (`SRP` 를 지킬 수 있음.)

#### 단점

* 새 클래스가 생겨 복잡도가 증가할 수 있다. 경우에 따라서는 기존 코드가 해당 Interface 를 구현하도록 수정하는것이
좋은 선택이 될 수도 있다.

#### 클래스 분리  vs 기존 코드 interface 구현?

기존의 `Adaptee`, `Adapter`, `Target Interface` 를 변경할 수 없을때는
직접 `Adapter` 클래스들 생성하여 생성자로 `Adaptee` 들을 주입받아 사용하게면, 기존의
`Adaptee`, `Adapter`, `Target Interface` 코드를 건드리지 않고 사용할 수 있다. (OCP, SRP 를 지킬 수 있음.)

하지만 내가 직접 `Adaptee`, `Adapter`, `Target Interface` 를 고칠 수가 있으면
별도로 `Adapter` 를 별도로 만들지 않고, 기존의 `Adaptee` 에 기존의 `Target Interface` 를
구현하도록 만들 수 있다. 

> SRP 의 관점에서 보면, 클래스를 나누는것이 조금더 객체지향 원칙에 가까운 기법이 되겠다.
하지만 그렇다고 무조건적으로 원칙보다 실용적인 선택을 하는것이 좋다.

#### 실무에서 어떻게 쓰이나?

##### 자바

* Arrays.asList(T...)
* Collections.list(Enumeration), Collections.enumeration()
* InputStreamReader(InputStream)
* OutputStreamWriter(OutputStream)

##### 스프링

* HandlerAdapter : 우리가 작성하는 다양한 형태의 Handler 코드를 Spring MVC 가 실행할 수있는 형태로
변환해주는 어댑터용 인터페이스.
