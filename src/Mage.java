public class Mage {
    String name, type;
    int level, damage;

    public Mage(String name, String type, int level, int damage) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.damage = damage;
    }

    public String getInfo() {
        String info = name + ", " + level + ", " + damage + ", " + type;
        System.out.println(info);
        return info;
    }

    public String fight(Mage mage) {
        String result = "";
        if (this.type.equals("fire") && mage.type.equals("ice")) {
            result = this.name;
            System.out.println(this.name);
        }
        if (this.type.equals("ice") && mage.type.equals("fire")) {
            result = mage.name;
        }
        if (this.type.equals("earth") && mage.type.equals("fire")) {
            result = this.name;
        }
        if (this.type.equals("fire") && mage.type.equals("earth")) {
            result = mage.name;
        }
        if (this.type.equals("ice") && mage.type.equals("earth")) {
            result = this.name;
        }
        if (this.type.equals("earth") && mage.type.equals("ice")) {
            result = mage.name;
        }
        if (this.type.equals(mage.type)) {
            if (this.level > mage.level) {
                result = this.name;
            }
            if (this.level < mage.level) {
                result = mage.name;
            }
            if (this.level == mage.level) {
                if (this.damage > mage.damage) {
                    result = this.name;
                }
                if (this.damage < mage.damage) {
                    result = mage.name;
                }
                if (this.damage == mage.damage) {
                    result = "draw";
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
