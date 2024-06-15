public class Child extends Parent {
    public int withdraw() {
        return setMoney(1000, SUB);
    }

    @Override
    public int getMoney() {
        return super.getMoney();
    }
}
