package chapter01.item01;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    /**
     * 정적 팩토리 메서드 장점 1 --> 이름을 가질 수 있다. (생성자의 시그니처가 중복되는경우 고려하는것이 좋을 것 같다.)
     * @param product
     * @return
     */
    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    /**
     * 정적 팩토리 메서드 장점 1 --> 이름을 가질 수 있다. (생성자의 시그니처가 중복되는경우 고려하는것이 좋을 것 같다.)
     * @param product
     * @return
     */
    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

}
