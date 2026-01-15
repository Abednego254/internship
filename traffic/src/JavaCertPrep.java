public class JavaCertPrep {

    public static class Product {
        double price;
    }

    public static class Test {
        public void updatePrice(Product product, double price) {
            price *= 2;
            product.price += price;
        }
    }

}
