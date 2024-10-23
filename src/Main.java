public class Main {
    public static void main(String[] args) {
        Mage mage1 = new Mage("Dana", "fire", 2, 3);
        Mage mage2 = new Mage("Dima", "fire", 2, 3);
        mage1.fight(mage2);
        mage1.getInfo();
        mage2.getInfo();
    }
}
