public interface Order {

    default void placeOrder() {
        verifyOrder();
        processOrder();
        confirmOrder();
    }
    void verifyOrder();
    void processOrder();
    void confirmOrder();
}
