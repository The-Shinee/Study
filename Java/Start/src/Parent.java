public class Parent {
    public static final int ADD = 0;
    public static final int SUB = 1 << 1;

    private int money;

    Parent() {
        money = 0;
    }

    public int getMoney() {
        return money;
    }

    public int setMoney(int value, int flag) {
        switch (flag) {
            case ADD:
                money += value;
                break;
            case SUB:
                money -= value;
                break;
            default:
                return -1;
        }

        return money;
    }

    public int save() {
        return setMoney(10000, ADD);
    }
}
