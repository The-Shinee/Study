public class Main {
    public static void main(String[] args) {
        Person me = new Person("Cheolan", 28, 1000000);
        Product earphone = new Product("INZONE Buds", 259000);
        Product headset = new Product("Inzone H9", 349000);
        Product keyboard = new Product("Corsair K70", 249000);

        me.BuyProduct(earphone);
        me.BuyProduct(headset);
        me.BuyProduct(keyboard);

        me.Introduce();
    }
}