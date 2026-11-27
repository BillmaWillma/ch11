public class Hero {
    private int maxHP, power, HP;
    private String name;
    static int hCount;

    public Hero(String name, int maxHp, int power) {
        hCount++;
        this.name = name;
        this.maxHP = maxHp;
        HP = maxHP;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getPower() {
        return power;
    }

    public static int getHeroCount() {
        return hCount;
    } 

    public boolean isDefeated() {
        return HP<=0;
    }

    public void takeDamage(int amount) {
        if (HP - amount >= 0) {
            HP -= amount;
        } else
            HP = 0;
    }

    public void heal(int amount) {
        if (!isDefeated() && HP + amount <= maxHP) {
            HP += amount;
        } else if (isDefeated()) {
            int useless_number_that_will_never_be_used = 1;
        } else
            HP = maxHP;
    }

    public boolean attack(Hero target) {
        if (target == this || isDefeated()) {
            return false;
        } else {
			target.takeDamage(power);
            return true;
        }
    }
    
    public String toString(){
		if(isDefeated()){
			return name + " [DEFEATED]";
		} else return name + " [HP " + HP + "/" + maxHP + "]";
	}
}
