//import java.util.ArrayList;
//
//public class Person {
//    public final String Name;
//
//    public static final double PI = 3.141592;
//    public int Age;
//    public int Cash;
//    public ArrayList<Product> Assets;
//
//    public Person(String name, int age, int cash){
//        Name = name;
//        Age = age;
//        Cash = cash;
//        Assets = new ArrayList<>();
//    }
//
//    public void Introduce(){
//        System.out.println("name : " + Name);
//        System.out.println("age : " + Age);
//        System.out.println("cash : " + Cash);
//        System.out.println();
//        PrintHasProducts();
//    }
//    public Product BuyProduct(Product product){
//        if(Cash < product.Price)
//            return null;
//
//        Cash -= product.Price;
//        AddProduct(product);
//        return product;
//    }
//    public void AddProduct(Product product){
//        Assets.add(product);
//    }
//
//    public void PrintHasProducts(){
//        if(Assets == null || Assets.isEmpty())
//            return;
//
//        System.out.println("My Assets");
//        for(Product p : Assets){
//            System.out.printf("%s : %d\n", p.Name, p.Price);
//        }
//    }
//}