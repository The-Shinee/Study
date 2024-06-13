public class InheritanceExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.save();
        c.save();
        c.withdraw();
        System.out.println(c.getMoney());
    }
}