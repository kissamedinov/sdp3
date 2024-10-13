public class Main {
    public static void main(String[] args) {
        ShoppingFacade facade = new ShoppingFacade();

        String productID = "12345";
        String paymentInfo = "98765432109875";
        String shippingAddress = "Kozhabergen Zhyrau 2";

        facade.placeOrder(productID, paymentInfo, shippingAddress);
    }
}